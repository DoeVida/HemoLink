<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil do doador</title>
</head>

<body>

	<div class="perfil-doador">
		<div class="foto-e-nome">
			<div>
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/7/76/Sukhoi_Su-30SM_in_flight_2014.jpg"
					width="100">
			</div>
			<div>
				<h2 id="apelido" class="informacao">${doador.apelido}</h2>
			</div>
		</div>
		<div class="conquistas">
			<div>
				<h3>conquistas</h3>
			</div>
			<div>
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/7/76/Sukhoi_Su-30SM_in_flight_2014.jpg"
					width="50">
			</div>
			<div>
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/7/76/Sukhoi_Su-30SM_in_flight_2014.jpg"
					width="50">
			</div>
			<div>
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/7/76/Sukhoi_Su-30SM_in_flight_2014.jpg"
					width="50">
			</div>
			<div>
				<img
					src="https://upload.wikimedia.org/wikipedia/commons/7/76/Sukhoi_Su-30SM_in_flight_2014.jpg"
					width="50">
			</div>
		</div>
		<div class="nome">
			<div>
				<label for="nome">Nome:</label>
			</div>
			<div>
				<p id="nome" class="informacao">${doador.nome}</p>
			</div>
		</div>

		<div class="tipo-sanguineo">
			<div>
				<label for="tipo-sanguineo">Tipo Sanguineo</label>
			</div>
			<div>
				<p id="tipoSanguineo" class="informacao">${doador.tipoSanguineo}</p>
			</div>
		</div>

		<div class="email">
			<div>
				<label for="email">email:</label>
			</div>
			<div>
				<p id="email" class="informacao">${doador.email}</p>
			</div>
		</div>
		<div class="calendario-doacoes">
			<div>
				<h3>Calendario de doações</h3>
			</div>
			<div class="botoes-calendario">
				<div>
					<a href="https://www.youtube.com/shorts/WjnqAG0SD0o">
						<button type="button">
							<img
								src="https://static.vecteezy.com/ti/vetor-gratis/p1/24150169-de-icone-de-calendario-vetor.jpg"
								width="100">
						</button>
					</a>
				</div>
				<div>
					<a href="https://www.youtube.com/shorts/WjnqAG0SD0o">
						<button type="button">
							<img
								src="https://static.vecteezy.com/ti/vetor-gratis/p1/24150169-de-icone-de-calendario-vetor.jpg"
								width="100">
						</button>
					</a>
				</div>
				<div>
					<a href="https://www.youtube.com/shorts/WjnqAG0SD0o">
						<button type="button">
							<img
								src="https://static.vecteezy.com/ti/vetor-gratis/p1/24150169-de-icone-de-calendario-vetor.jpg"
								width="100">
						</button>
					</a>
				</div>
				<div>
					<a href="https://www.youtube.com/shorts/WjnqAG0SD0o">
						<button type="button">
							<img
								src="https://static.vecteezy.com/ti/vetor-gratis/p1/24150169-de-icone-de-calendario-vetor.jpg"
								width="100">
						</button>
					</a>
				</div>
			</div>
		</div>
		<%--Para esta consulta ocorrer, tem de se fazer uma variavel "ultimaDoacao" no servlet que fara a consulta
        do historico de doacoes de certo doador e resgatar apenas a ultima, tendo ela como o valor da variavel --%>
		<div class="data-ultima-doacao">
			<div>
				<h3>Sua ultima doação foi no dia:</h3>
			</div>
			<div>
				<h3>${doador.ultimaDoacao}</h3>
			</div>
		</div>



	</div>

</body>

</html>
