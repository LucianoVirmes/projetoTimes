<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Index</title>

</head>
<body>
    <table>
        <thead>
	        <tr>
	            <th>Time</th>
	            <th>Pontuação</th>
	        <tr>
        </thead>
        <tbody>
            <c:forEach var="time" items="${times}">
               <tr>
                   <td>${time.nome}</td>
                   <td>${time.pontuacao}<td>
                   <td><a href="time/excluir/${time.codigo }">Excluir</a></td>
               </tr>
            </c:forEach>

        </tbody>
    </table>
    <button class="center-block btn btn-default"><a href="time/cadastro">Cadastrar time</a></button>
    <button class="center-block btn btn-default"><a href="campeonato/jogar">Jogar</a></button>
</body>
</html>