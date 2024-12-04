<!DOCTYPE html>
<html lang="pt-BR">

<head>
<title>Cadastro de Usuario</title>
</head>

<body>

	<div class="Cadastro">
		<h1>Registre-se</h1>
		<form action="inserir-doador" method="post">
			<div class="apelido">
				<div>
					<label for="apelido">Apelido*</label>
				</div>
				<div>
					<input type="text" id="apelido" name="apelido" required>
				</div>
			</div>

			<div class="nome">
				<div>
					<label for="nome">Nome*</label>
				</div>
				<div>
					<input type="text" id="nome" name="nome" required>
				</div>
			</div>

			<div class="cpf">
				<div>
					<label for="cpf">CPF*</label>
				</div>
				<div>
					<input type="text" id="cpf" name="cpf" maxlength="11" size="11"
						required>
				</div>
			</div>

			<div class="tipo-sanguineo">
				<div>
					<label for="tipo-sanguineo">Tipo Sanguíneio*</label>
				</div>
				<div>
					<select id="tipo-sanguineo" name="tipo-sanguineo" required>
						<option value="">Selecione</option>
						<option value="a-positivo">A+</option>
						<option value="a-negativo">A-</option>
						<option value="b-positivo">B+</option>
						<option value="b-negativo">B-</option>
						<option value="ab-positivo">AB+</option>
						<option value="ab-negativo">AB-</option>
						<option value="o-positivo">O+</option>
						<option value="o-negativo">O-</option>

					</select>
				</div>
			</div>

			<div class="data-nascimento">
				<div>
					<label for="data-nascimento">Data de Nascimento*</label>
				</div>
				<div>
					<input type="date" id="data-nascimento" name="data-nascimento"
						required>
				</div>
			</div>

			<div class="telefone">
				<div>
					<label for="telefone">Telefone*</label>
				</div>
				<div>
					<input type="text" id="telefone" name="telefone" required>
				</div>
			</div>

			<div class="sexo">
				<div>
					<label for="sexo">Sexo*</label>
				</div>
				<div>
					<select id="sexo" name="sexo" required>
						<option value="">Selecione</option>
						<option value="Masculino">M</option>
						<option value="Feminino">F</option>
					</select>
				</div>
			</div>

			<div class="email">
				<div>
					<label for="email">Email*</label>
				</div>
				<div>
					<input type="text" id="email" name="email" required>
				</div>
			</div>

			<div class="senha">
				<div>
					<label for="senha">Senha*</label>
				</div>
				<div>
					<input type="password" id="senha" name="senha" required>
				</div>
			</div>

			<div class="confirmar-senha">
				<div>
					<label for="confirmar-senha">Confirmação de senha*</label>
				</div>
				<div>
					<input type="password" id="confirmar-senha" name="confirmar-senha"
						required>
				</div>
			</div>
			<div class="botao-continuar">
					<input type="submit" value="Continuar">
					</div>
				</form>
			
	</div>

</body>

</html>