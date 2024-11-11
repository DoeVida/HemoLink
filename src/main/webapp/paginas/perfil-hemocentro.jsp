<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil do Hemocentro</title>
</head>
<body>


		<!-- Nome e Apelido do Hemocentro -->
	<div class="foto-e-nome">

		<div>
			<h2>${hemocentro.apelido}</h2>
		</div>
	</div>


		<!-- Horário de Atendimento -->
	<div class="horarios">
	
		<div>
			<h3>Horário de atendimento</h3>
		</div>

		<div>
			<p>Aberto das ${hemocentro.horarioInicio} às
				${hemocentro.horarioFim} de segunda a sexta</p>
		</div>
	</div>


		<!-- Informações de Contato -->
	<div class="nome">
		<div>
			<label for="nome"><strong>Nome:</strong> ${hemocentro.nome}</label>
		</div>
		<div>
			<input type="text" id="nome" name="nome" placeholder="...">
		</div>
	</div>

	<div class="telefone">
		<div>
			<label for="telefone"><strong>Telefone:</strong> ${hemocentro.contato.telefone}</label>
		</div>
		<div>
			<input type="tel" id="telefone" name="telefone" placeholder="...">
		</div>
	</div>

	<div class="email">
		<div>
			<label for="email"><strong>Email:</strong> ${hemocentro.contato.email}</label>
		</div>
		<div>
			<input type="email" id="email" name="email" placeholder="...">
		</div>
	</div>


 		<!-- Endereço -->
	<div class="cidade">
		<div>
			<label for="cidade"><strong>Cidade:</strong> ${hemocentro.endereco.cidade}</label>
		</div>
		<div>
			<input type="text" id="cidade" name="cidade" placeholder="...">
		</div>
	</div>

	<div class="estado">
		<div>
			<label for="estado"><strong>Estado:</strong> ${hemocentro.endereco.estado}</label>
		</div>
		<div>
			<input type="text" id="estado" name="estado" placeholder="...">
		</div>
	</div>

	<div class="numero">
		<div>
			<label for="numero"><strong>Numero:</strong> ${hemocentro.endereco.numero}</label>
		</div>
		<div>
			<input type="text" id="numero" name="numero" placeholder="...">
		</div>
	</div>

	<div class="bairro">
		<div>
			<label for="bairro"><strong>Bairro:<</strong> ${hemocentro.endereco.bairro}</label>
		</div>
		<div>
			<input type="text" id="bairro" name="bairro" placeholder="...">
		</div>
	</div>



	<div class="logradouro">
		<div>
			<label for="logradouro"><strong>Logradouro:</strong> ${hemocentro.logradouro}</label>
		</div>
		<div>
			<input type="text" id="logradouro" name="logradouro"
				placeholder="...">
		</div>
	</div>


		<!-- Campanhas Feitas -->
	<div class="campanhas">
		<div>
			<h3>Campanhas Feitas</h3>
		</div>
			<label for="campanha"><strong>Campanha:</strong> ${hemocentro.campanhas}</label>
		<div>
			<h5>Conteudo da campanha...</h5>
		</div>
	</div>
	</div>
</body>

</html>
