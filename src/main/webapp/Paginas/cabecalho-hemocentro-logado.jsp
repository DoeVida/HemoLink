<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cabeçalho do hemocentro logado</title>
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
		<div class="link-para-doacoes">
			<a href="validar-doacoes.jsp">Doações</a>
		</div>
		<div class="link-para-minhas-campanhas">
			<a href="campanhas-hemocentro.jsp">Minhas campanhas</a>
		</div>
		<div class="botao-de-perfil">
				<a href="pop-up-perfil-doador.jsp">
					<img src="imagem-de-perfil-do-doador">
				</a>
		</div>
	</div>
</body>
</html>