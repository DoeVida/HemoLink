<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar campanhas</title>
</head>
<body>
	<div class="cadastro-campanha">
		<h1>Cadastrar Campanha</h1>
			<form action="<%=request.getContextPath()%>/inserir-campanha" method="post">
				<div class="informacoes-da-campanha">
					<div class="titulo-da-campanha">
						<div>
							<label for="titulo-da-campanha">Título da campanha:</label>
						</div>
						<div>
							<input type="text" id="titulo-da-campanha" name="titulo-da-campanha" class="input-de-informacao">
						</div>
					</div>
					<div class="datas-limite-da-campanha">
						<div class="data-de-inicio">
							<input type="date" id="data-de-inicio" name="data-de-inicio" class="input-de-informacao">
						</div>
						<div class="data-de-fim">
							<input type="date" id="data-de-fim" name="data-de-fim" class="input-de-informacao">
						</div>
					</div>
					<div class="imagem-campanha">
						<input type="file" id="imgagem-da-campanha" name="imagem-da-campanha" class="input-de-informacao" accept=".png, .jpeg">
					</div>
					<div class="descricao-campanha">
						<div>
							<label for="descricao-campanha">Descrição da campanha:</label>
						</div>
						<div>
							<input type="text" maxlength="500" id="descricao-campanha" name="descricao-campanha" class="input-de-informacao" placeholder="500 caracteres max">
						</div>
					</div>
				</div>
				<div class="informacoes-da-demanda">
					<div class="tipo-sanguineo">
						<div>
							<label for="tipo-sanguineo">Tipo sanguíneo</label>
						</div>
						<div>
							<select id="tipo-sanguineo" name="tipo-sanguineo" class="input-de-informacao">
								<option value="">Selecione</option>
		                        <option value="A+">A+</option>
		                        <option value="A-">A-</option>
		                        <option value="B+">B+</option>
		                        <option value="B-">B-</option>
		                        <option value="AB+">AB+</option>
		                        <option value="AB-">AB-</option>
		                        <option value="O+">O+</option>
		                        <option value="O-">O-</option>
							</select>
						</div>
					</div>
					<div class="capacidade">
						<div>
							<label for="capacidade">Capacidade:</label>
						</div>
						<div>
							<select id="capacidade" name="capacidade" class="input-de-informacao">
								<option value="">Selecione</option>
								<option value="emergencia">Emergência</option>
								<option value="alerta">Alerta</option>
								<option value="reduzido">Reduzido</option>
								<option value="moderado">Moderado</option>
								<option value="adequado">Adequado</option>
							</select>
						</div>
					</div>
					<div class="quantidade-de-litros">
						<div>
							<label for="quantidade-de-litros">Quantidade de litros:</label>
						</div>
						<div>
							<input type="number" id="quantidade-de-litros" name="quantidade-de-litros" class="input-de-informacao">
						</div>
					</div>
				</div>
			</form>
	</div>
</body>
</html>