<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>Veterinaria</title>

	<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>

	<script type="text/javascript">
		 
		 
	function load(chip, nombre, especie, peso){
	    var entry = document.createElement('li');
	    entry.id = chip;

	    // DELETE
	    var a = document.createElement('a');
	    var linkText = document.createTextNode(" [Borrar]");
	    a.appendChild(linkText);
	    
	    a.onclick = function () {
	        $.ajax({
	            url: 'clinica/mascotas/' + chip,
	            type: 'DELETE',
	            dataType: "json",
	            success: function(result) {
	                document.getElementById(chip).remove();
	            },
	            error: function(jqXhr, textStatus, errorMessage){
	                alert('Error al borrar');	
	            }
	        });
	    };

	    entry.appendChild(document.createTextNode("(" + chip + ") " + nombre + " - " + especie + " | Peso: " + peso + "kg"));
	    entry.appendChild(a);		
	    $('#mascotas').append(entry);
	}

	$(document).ready(function(){
	    
	    // POST
	    $("#registrarMascota").click(function(){
	        
	        var sendInfo = {
	            chip: $('#chip').val(), 
	            nombre: $('#nombre').val(), 
	            especie: $('#especie').val(), 
	            peso: parseFloat($('#peso').val()) 
	        };
	    
	        $.ajax({
	            url: 'clinica/mascotas', 
	            headers: { 
	                'Accept': 'application/json',
	                'Content-Type': 'application/json' 
	            },
	            type: 'POST',
	            dataType: "json", 
	            success: function(result) {
	                load(result.mascota.chip, result.mascota.nombre, result.mascota.especie, result.mascota.peso);
	            },
	            error: function(jqXhr, textStatus, errorMessage){
	                alert('Error al registrar la mascota');	
	            },
	            data: JSON.stringify(sendInfo)
	        });
	        
	    });

	    
	    // GET		
	    $.ajax({
	        url: 'clinica/mascotas/listado',
	        type: 'GET',
	        dataType: "json",
	        success: function(result) {
	            if(result.mascotas) {
	                jQuery.each(result.mascotas, function(i, val) {
	                    load(val.chip, val.nombre, val.especie, val.peso);
	                });
	            }
	        }
	    });
	    
	});
		

 
	</script>

</head>




<body>

<h1>Control Mascotas</h1>

	<label>Chip:</label><br>
	<input type="text" id="chip"><br><br>

	<label>Nombre:</label><br>
	<input type="text" id="nombre"><br><br>

	<label>Especie:</label><br>
	<input type="text" id="especie"><br><br>

	<label>Peso:</label><br>
	<input type="number" id="peso" step="0.01"><br><br>

	<button id="registrarMascota">Registrar</button>

	<h2>Lista de Mascotas</h2>
	<ul id="mascotas"></ul>

</body>


</html>