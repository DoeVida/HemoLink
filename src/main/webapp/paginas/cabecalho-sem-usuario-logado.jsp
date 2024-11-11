<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cabeçalho sem usuario logado</title>
</head>
<body>
	<div class="cabecalho">
		<div class="logo-do-site">
			<a href="pagina-inicial.jsp">
				<img src="logo-do-site.png">
			</a>
		</div>
		<form action="<%=request.getContextPath()%>/resgatar-campanhas" method="post">
			<div class="barra-de-pesquisa">
				<input type="search" id="barra-de-pesquisa" name="barra-de-pesquisa" placeholder="Pesquisar...">
			</div>
		</form>
		<div class="botao-de-registro">
			<a href="cadastro-usuario.jsp">Registrar</a>
		</div>
		<div>
			<a href="tela-de-login.jsp">Entrar</a>
		</div>
	</div>
</body>
</html>