<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Jogar</title>
</head>
<body>
    	<form method="post">
            <select name="time1.codigo">
                <c:forEach var="time1" items="${times}">
                    <option  value="${time1.codigo}">${time1.nome}</option>
                </c:forEach>
            </select> 
            <input type="text" placeholder="Gols" name="time1.gol" /> <br> 
            <select name="time2.codigo">
                <c:forEach var="time2" items="${times}">
                    <option  value="${time2.codigo}">${time2.nome}</option>
                </c:forEach>
            </select> 
            <input type="text"placeholder="Gols" name="time2.gol" /> <br> 
            <br> 
            <input style="margin-left: 18%" type="submit"name="enviar" />
            </form>
</body>
</html>