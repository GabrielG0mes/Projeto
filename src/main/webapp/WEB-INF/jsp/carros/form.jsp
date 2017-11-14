<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>Novo carro:</legend>
	<form action="/persistirCarro" method="get" onsubmit="window.location.reload();">
		Nome: <input type="text" name="nome"><br>
		Valor: <input type="text" name="valor"><br>
		<input type="submit"> 
	</form>
	</fieldset>
	
	<h1>lista de carros</h1>
	<table>
  		<c:forEach items="${carros}" var="carro">
    		<tr>
      			<td><c:out value="${carro.nome}" /></td>
      			<td><c:out value="${carro.valor}" /></td>
    		</tr>
  		</c:forEach>
	</table>
</body>
</html>