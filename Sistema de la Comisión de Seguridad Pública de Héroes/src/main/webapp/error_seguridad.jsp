<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>¡ALERTA DE SEGURIDAD!</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #ffe6e6; 
            margin-top: 50px;
        }
        .alerta {
            color: #cc0000;
            font-size: 24px;
            font-weight: bold;
        }
        .mensaje {
            font-size: 18px;
            margin: 20px;
        }
        .boton {
            padding: 10px 20px;
            background-color: #000000;
            color: #ffffff;
            text-decoration: none;
            font-weight: bold;
            border-radius: 5px;
        }
    </style>
</head>
<body>

    <h1 class="alerta">🛑 ACCESO DENEGADO 🛑</h1>
    
    <div class="mensaje">
        <p>El sistema de seguridad de la Comisión de Héroes ha bloqueado tu petición.</p>
        <p><strong>Motivo:</strong> No se ha detectado ninguna credencial de Agencia Activa. Es posible que tu sesión haya caducado o estés intentando acceder a una zona restringida.</p>
        <p><em>Posible actividad de la Liga de Villanos detectada...</em></p>
    </div>

    <br>
    
    <a href="index.jsp" class="boton">Volver al Inicio para Identificarse</a>

</body>
</html>