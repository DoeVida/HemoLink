<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Configuracoes-perfil</title>
</head>
<body>
	<div class="Configuracoes">
		<div class="Perfil">
			<div class="FotoDePerfil">
				<img src="imagem_usuario.jpg" alt="foto de perfil">
			</div>
			<div class="Apelido">
				<h1>Apelido</h1>
			</div>
		</div>
		<div class="Opcoes">
			<div class="InformacoesPessoais">
				<h2>Informações pessoais</h2>
			</div>
			<div class="Segurança">
				<h2>Segurança</h2>
			</div>
		</div>
		<form>
			<div class="EdicaoInformacoesPessoais">
				<div class="Nome">
					<div>
						<label for="nome">Nome:</label>
					</div>
					<div>
						<input type="text" id="nome" name="nome">
					</div>
				</div>
				<div class="NomeDeUsuario">
					<div>
						<label for="nome-de-usuario">Nome de usuário:</label>
					</div>
					<div>
						<input type="text" id="nome-de-usuario" name="nome-de-usuario">
					</div>
				</div>
				<div class="e-mail">
					<div>
						<label for="e-mail">E-mail:</label>
					</div>
					<div>
						<input type="email" id="e-mail" name="e-mail">
					</div>
				</div>
				<div class="TipoSanguineo">
					<div>
						<label for="tipo-sanguineo">Tipo sanguíneo:</label>
					</div>
					<div>
						<input type="text" id="tipo-sanguineo" name="tipo-sanguineo">
					</div>
				</div>
				<div class="DataDeNascimento">
					<div>
						<label for="data-de-nascimento">Data de nascimento:</label>
					</div>
					<div>
						<input type="date" id="data-de-nascimento" name="data-de-nascimento">
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
			</div>
		</form>		
	</div>

</body>
</html>