<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>

<html lang="pt-BR">
<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Pagina inicial</title>

</head>

<body>
	<div class="tela-de-inicio">
		<div class="card-de-informacoes">
			<div class="informacoes">
				<h1>Projeto Solidário Hemolink</h1>
				<div>
					<h2>O hemolink proporciona:</h2>
					<ul>
						<li>Agendamento de doação</li>
						<li>Importância da doação</li>
					</ul>
				</div>
			</div>
			<div class="botao-de-agendar-doacao">
		        <button>
		            <a href="agendamento-doacao.html">Fazer doação</a>
		        </button>
		    </div>
	   	</div>
		    <div class="status-perfil">
		        <div class="botão-perfil">
		            <button type="button"><a href="../Perfil-Doador.html"></a>
		            <img src="https://definicion.de/wp-content/uploads/2019/07/perfil-de-usuario.png" width="75 px"></button>
		        </div>
		        <div class="nome-usuario">
		            <p>Viviane Oliva</p>
		        </div>
		        <div class="numero-medalhas">
		            <p>x</p>
		        </div>
		        <div class="imagem-medalha">
		            <img src="https://static.vecteezy.com/system/resources/previews/000/583/381/large_2x/medal-icon-vector.jpg" alt="medalha" width="40 px">
		        </div>
		    </div>
		    
		    <c:if test="${not empty campanhas}">
				<c:forEach var="campanha" items="${campanhas}">
				    <div>
				        <c:set var="endereco" value="${campanha.hemocentro.endereco}" />
				        <h3>Hemocentro: ${campanha.hemocentro}</h3>
				        <p>Endereço: ${endereco.estado} ${endereco.cidade} ${endereco.bairro} ${endereco.logradouro} ${endereco.numero} ${endereco.cep}</p>
				        <p>Título: ${campanha.titulo}</p>
				        <p>Descrição: ${campanha.descricao}</p>
				    </div>
				</c:forEach>
			</c:if>
	</div>    
</body>    
</html>