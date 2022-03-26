<%-- 
    Document   : reporte3
    Created on : 29-ene-2019, 15:23:44
    Author     : José
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clun de Fútbol</title>
    </head>
    <body>
        <h1>Reporte 3</h1>
        <h2>Listado de Arqueros de Reserva y Cuarta</h2>
        
        <table border="1">
            
            <tr><th>Número</th><th>Nombre</th><th>División</th><th>Edad</th></tr>
            
            <c:forEach items="${lista}" var="P">
                <tr><td>${P.numero}</td><td>${P.nombre}</td><td>${P.nombreD}</td><td>${P.edad}</td></tr>
            </c:forEach>
        </table>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
