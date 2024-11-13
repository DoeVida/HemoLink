<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registro Hemocentro</title>
</head>
<body>
	<div class="Registre Hemocentro">
		<h1>Registre-se</h1>
		<form action="<%=request.getContextPath()%>/inserir-hemocentro"
			method="post">
			<div class="NomeUsuario">
				<div>
					<label for="nome-usuario">Nome de Usuário:</label>
				</div>
				<div>
					<input type="text" id="apelido" name="apelido">
				</div>
			</div>
			<div class="NomeHemocentro">
				<div>
					<label for="nome-hemocentro">Nome do Hemocentro:</label>
				</div>
				<div>
					<input type="text" id="nome" name="nome">
				</div>
			</div>
			<div class="CNJP">
				<div>
					<label for="cnpj">CNPJ:</label>
				</div>
				<div>
					<input type="text" id="cnpj" name="cnpj" maxlength="14" size="14">
				</div>
			</div>
			<div class="Email">
				<div>
					<label for="email">Email:</label>
				</div>
				<div>
					<input type="email" id="email" name="email">
				</div>
			</div>
			<div class="InicioHorarioDeAtendimento">
				<div>
					<label for="horario-de-inicio">Inicio Horário de
						Atendimento:</label>
				</div>
				<div>
					<input type="time" id="horario-inicio" name="horario-inicio">
				</div>
			</div>
			<div class="FinalHorarioDeAtendimento">
				<div>
					<label for="horario-de-fim">Final Horário de Atendimento:</label>
				</div>
				<div>
					<input type="time" id="horario-fim" name="horario-fim">
				</div>
			</div>
			<div class="Telefone">
				<div>
					<label for="telefone">Telefone:</label>
				</div>
				<div>
					<input type="tel" id="telefone" name="telefone">
				</div>
			</div>
			<div class="Estado">
				<div>
					<label for="estado">Estado:</label>
				</div>
				<div>
					<select id="UF" name="UF">
						<option value="">Selecione</option>
						<option value="AC">Acre</option>
						<option value="AL">Alagoas</option>
						<option value="AP">Amapá</option>
						<option value="AM">Amazonas</option>
						<option value="BA">Bahia</option>
						<option value="CE">Ceará</option>
						<option value="DF">Distrito Federal</option>
						<option value="ES">Espirito Santo</option>
						<option value="GO">Goiás</option>
						<option value="MA">Maranhão</option>
						<option value="MS">Mato Grosso do Sul</option>
						<option value="MT">Mato Grosso</option>
						<option value="MG">Minas Gerais</option>
						<option value="PA">Pará</option>
						<option value="PB">Paraíba</option>
						<option value="PR">Paraná</option>
						<option value="PE">Pernambuco</option>
						<option value="PI">Piauí</option>
						<option value="RJ">Rio de Janeiro</option>
						<option value="RN">Rio Grande do Norte</option>
						<option value="RS">Rio Grande do Sul</option>
						<option value="RO">Rondônia</option>
						<option value="RR">Roraima</option>
						<option value="SC">Santa Catarina</option>
						<option value="SP">São Paulo</option>
						<option value="SE">Sergipe</option>
						<option value="TO">Tocantins</option>
					</select>
				</div>
			</div>
			<div class="Cidade">
				<div>
					<label for="cidade">Cidade:</label>
				</div>
				<div>
					<input type="text" id="cidade" name="cidade">
				</div>
			</div>
			<div class="Bairro">
				<div>
					<label for="bairro">Bairro:</label>
				</div>
				<div>
					<input type="text" id="bairro" name="bairro">
				</div>
			</div>
			<div class="Rua">
				<div>
					<label for="rua">Rua:</label>
				</div>
				<div>
					<input type="text" id="logradouro" name="logradouro">
				</div>
			</div>
			<div class="Numero">
				<div>
					<label for="numero">Número:</label>
				</div>
				<div>
					<input type="number" id="numero" name="numero">
				</div>
			</div>
			<div class="CEP">
				<div>
					<label for="cep">CEP:</label>
				</div>
				<div>
					<input type="text" id="cep" name="cep" maxlength="8" size="8">
				</div>
			</div>
			<div class="Senha">
				<div>
					<label for="senha">Senha:</label>
				</div>
				<div>
					<input type="password" id="senha" name="senha">
				</div>
			</div>
			<div class="ConfirmarSenha">
				<div>
					<label for="confirmar-senha">Confirmação da Senha:</label>
				</div>
				<div>
					<input type="password" id="confirmar-senha" name="confirmar-senha">
				</div>
			</div>
			<div>
				<button type="submit">Registrar</button>
			</div>
		</form>
	</div>
</body>
</html>