<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aeropuerto</title>

	<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
	
	<script type="text/javascript">

	
	
	function load(codigo,  destino, aerolinea, precio){
		var entry = document.createElement('li');
		
		var a = document.createElement('a');
					
		var linkText = document.createTextNode(" [Cancelar]");
					
		a.appendChild(linkText);
					
		a.onclick = function () {
			$.ajax({
			    url: 'api/vuelos/' + codigo,
			    type: 'DELETE',
			    dataType: "json",
			    success: function(result) {
			    	document.getElementById(codigo).remove();
			    },
		    	error: function(jqXhr, textStatus, errorMessage){
			    	alert('error');	
			    }
			});
		};

		
		entry.id = codigo;		
		
		entry.appendChild(document.createTextNode("("+ codigo + ") " + destino + " " + aerolinea + " " + precio));
		 
		entry.appendChild(a);			
		
		$('#vuelo').append(entry);
		
	}

	//------------------------------------------------------------------------------

	
	$(document).ready(function(){
			
			$("#sendButton").click(function(){
				
				var sendInfo = {codigo: $('#codigo').val(), destino: $('#destino').val(), aerolinea: $('#aerolinea').val(), precio: parseFloat($('#precio').val())};
				
			    $.ajax({
					    url: 'api/vuelos', 
					    headers: { 
				               'Accept': 'application/json',
				               'Content-Type': 'application/json' 
				           },
					    type: 'POST',
					    dataType: "json", 
					    success: function(result) {
					    	load(result.vuelo.codigo,result.vuelo.destino,result.vuelo.aerolinea,result.vuelo.precio);
					    },
				    	error: function(jqXhr, textStatus, errorMessage){
					    	alert('Error: ' + jqXhr.responseJSON.resultado);	
					    },
					    data:  JSON.stringify(sendInfo)
					    
					});
			    });

			$.ajax({
			    url: 'api/vuelos/listado',
			    type: 'GET',
			    dataType: "json",
			    success: function(result) {
					jQuery.each(result.vuelo, function(i, val) {
						load(val.codigo, val.destino, val.aerolinea, val.precio);
			    		});
			    }
			});
		});




	</script>

</head>



<body>

<h1>Registro</h1>

	<label>Codigo:</label><br>
	<input type="text" id="codigo"><br><br>

	<label>Destino:</label><br>
	<input type="text" id="destino"><br><br>

	<label>Aerolinea:</label><br>
	<input type="text" id="aerolinea"><br><br>

	<label>Precio:</label><br>
	<input type="number" id="precio" step="0.01"><br><br>

<button id="sendButton">Crear</button>

<h2>Listar</h2>

<br>
	<ul id="vuelo"></ul>

</body>



</html>