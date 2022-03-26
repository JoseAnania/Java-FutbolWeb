<%-- 
    Document   : altaJugador
    Created on : 29-ene-2019, 12:04:43
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
        <h1>Alta de Jugador</h1>
        
        <form method="post" action="ServletAltaJugador">
            <label form="numero">Número: </label>
            <input type="text" name="numero"/>
            <br>
            <br>
            <label form="nombreJ">Nombre: </label>
            <input type="text" name="nombreJ"/>
            <br>
            <br>
            Posición: <select name="cboPosicion" id="cboPosicion" required="requiered">
                <option value="" disabled selected> Seleccione la Posición: </option>
                    <c:forEach items="${lista}" var="P">
                        <option value=${P.idP}>${P.nombreP}</option>
                    </c:forEach>               
            </select>
            <br>
            <br>
            División: <select name="cboDivision" id="cboDivision" required="requiered">
                <option value="" disabled selected> Seleccione la División: </option>
                    <c:forEach items="${lista2}" var="D">
                        <option value=${D.idD}>${D.nombreD}</option>
                    </c:forEach>               
            </select>
            <br>
            <br>
            <label form="edad">Edad: </label>
            <input type="text" name="edad"/>
            <br>
            <br>
            <input type="submit" value="Aceptar"/>
        </form>
        <br>
        <br>
        <a href="index.html">Volver</a>
    </body>
</html>
