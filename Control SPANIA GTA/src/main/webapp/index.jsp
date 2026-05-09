<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Control coches - SPANIA GTA</title>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">

function load(matricula, modelo, precio) {
    var entry = document.createElement('li');
    entry.id = matricula; 

    // --- ENLACE EDITAR ---
    var btnEditar = document.createElement('a');
    btnEditar.appendChild(document.createTextNode(" [Editar] "));
    btnEditar.href = "javascript:void(0);";
    btnEditar.onclick = function() {
        // Al pulsar "Editar", rellenamos el formulario con los datos de este coche
        $('#matricula').val(matricula);
        $('#modelo').val(modelo);
        $('#precio').val(precio);
        // Bloqueamos la matrícula para que el usuario no la cambie por error
        $('#matricula').prop('readonly', true);
    };

    // --- ENLACE BORRAR ---
    var btnBorrar = document.createElement('a');
    btnBorrar.appendChild(document.createTextNode("[Borrar]"));
    btnBorrar.href = "javascript:void(0);";
    btnBorrar.onclick = function () {
        $.ajax({
            url: 'spania/coches/' + matricula, 
            type: 'DELETE',
            dataType: "json",
            success: function(result) {
                document.getElementById(matricula).remove();
            },
            error: function(jqXhr){
                alert('Error al borrar el coche');    
            }
        });
    };

    // Construimos la línea de la lista
    entry.appendChild(document.createTextNode("(" + matricula + ") " + modelo + " | " + precio + "€"));
    entry.appendChild(btnEditar);
    entry.appendChild(btnBorrar);
    
    $('#coches').append(entry);
}

$(document).ready(function(){

    // --- PETICIÓN POST (CREAR) ---
    $("#crearCoche").click(function(){
        var cocheInfo = {
            matricula: $('#matricula').val(), 
            modelo: $('#modelo').val(), 
            precio: parseFloat($('#precio').val())
        };
        
        $.ajax({
            data: JSON.stringify(cocheInfo),
            url: 'spania/coches', 
            headers: {'Accept': 'application/json', 'Content-Type': 'application/json'},
            type: 'POST', 
            dataType: "json",
            success: function(result) {
                load(result.coche.matricula, result.coche.modelo, result.coche.precio);
                // Limpiar formulario
                $('#matricula').val('');
                $('#modelo').val('');
                $('#precio').val('');
            },
            error: function(jqXhr){
                if(jqXhr.status == 409) alert('La matrícula ya existe.');
                else alert('Error al crear el coche');    
            }
        });
    });

    // --- PETICIÓN PUT (MODIFICAR) ---
    $("#modificarCoche").click(function(){
        var cocheInfo = {
            matricula: $('#matricula').val(), 
            modelo: $('#modelo').val(), 
            precio: parseFloat($('#precio').val())
        };
        
        $.ajax({
            data: JSON.stringify(cocheInfo),
            url: 'spania/coches', 
            headers: {'Accept': 'application/json', 'Content-Type': 'application/json'},
            type: 'PUT', // Usamos el método PUT
            dataType: "json",
            success: function(result) {
                // Borramos el coche viejo de la lista en pantalla
                document.getElementById(result.coche.matricula).remove();
                
                // Lo volvemos a pintar con los datos nuevos
                load(result.coche.matricula, result.coche.modelo, result.coche.precio);
                
                // Limpiamos el formulario y desbloqueamos la casilla de matrícula
                $('#matricula').val('').prop('readonly', false);
                $('#modelo').val('');
                $('#precio').val('');
                
                alert('¡Coche modificado con éxito!');
            },
            error: function(jqXhr){
                alert('Error al modificar el coche');    
            }
        });
    });

    // --- PETICIÓN GET (LISTAR AL INICIO) ---
    $.ajax({
        url: 'spania/coches/listado', 
        type: 'GET',
        dataType: "json",
        success: function(result) {
            if(result.coches) {
                jQuery.each(result.coches, function(i, val) { 
                    load(val.matricula, val.modelo, val.precio);
                });
            }
        }       
    });
});

</script>
</head>



<body>

<h1>Control coches SPANIA GTA:</h1>

<p>Formulario de registro</p>
Matricula: <input type="text" id="matricula"><br>
Modelo: <input type="text" id="modelo"><br>
Precio: <input type="number" id="precio" step="0.01"><br>
<button id="crearCoche">Crear</button>
<button id="modificarCoche">Modificar</button>

<br><br>
<h3>Lista de vehículos en parking</h3>
<ul id="coches"></ul>

</body>
</html>