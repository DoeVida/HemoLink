<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<c:choose>
<c:when test="${not empty 'usuariologado' }">
<h1>Usuario logado</h1>
</c:when>
<c:otherwise>
<h1>Usuario nao logado</h1>
</c:otherwise>
</c:choose>
<a href="<%= request.getContextPath()%>/paginas/cadastro-doador.jsp">Cadastro Doador</a> 
<a href="paginas/login.jsp"></a>
</body>
</html>
