<%-- 
    Document   : reporte1
    Created on : 29-ene-2019, 14:42:24
    Author     : José
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Club de Fútbol</title>
    </head>
    <body>
        <h1>Reporte 1</h1>
        
        <table border="1">
            
            <tr><th>Cantidad de Jugadores entre 16 y 19 años</th></tr>
            
            <tr><td>${lista}</td></tr>
            
        </table>
            <br>
            <br>
                <a href="index.html">Volver</a>
    </body>
</html>
