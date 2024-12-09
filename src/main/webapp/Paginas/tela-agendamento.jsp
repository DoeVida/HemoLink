<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Marque sua doação</title>
</head>

<body>
	<div class="MarcarDoacao">
	    <h1>Doação de sangue</h1>
	    <H2>Informacoes de saude</H2>
	    <form action="#" method="post">
	    	<div class="InformacoesDoacao">
				<div class="TipoSanguineo">
					<div>
			        	<label for="Tipo SanguÃ­neo">Tipo Sanguíneo</label>
			        </div>
			        <div>
				        <select name="Tipo sanguineo" id="Tipo sanguineo" required>
				            <option value="">Selecione...</option>
				            <option value="A+">A+</option>
				            <option value="A-">A-</option>
				            <option value="O+">O+</option>
				            <option value="O-">O-</option>
				            <option value="AB+">AB+</option>
				            <option value="AB-">AB-</option>
				            <option value="O+">O+</option>
				            <option value="O-">O-</option>
				        </select>
			        </div>
				</div>
				<div class="DataEHora">
					<div>
				        <label for="data-hora">Dia e horário para comparecer:</label>
				    </div>
				    <div>    
				        <input type="date" id="data-hora" name="data-hora" required>
				        <input type="time" id="hora" name="data-hora" required>
				    </div>
				</div>        
				<div class="Hemocentro">
					<div>
				        <label for="local-hemocentro">Local de hemocentro de preferência:</label>
				    </div>
				    <div>
				        <select name="local-hemocentro" id="local-hemocentro" required>
				            <option value="">Selecionar...</option>
				            <option value="Florianópolis">Florianópolis</option>
				            <option value="Blumenau">Blumenau</option>
				            <option value="Joinville">Joinville</option>
				        </select>
				    </div>    
				</div>		        
			</div>	        
	        <div class="CuidadosNecessarios">
	        	<div>
	        		<input type="checkbox" id="aceitar-criterios" name="aceitar-criterios" required>	
			        <label for="aceitar-criterios">Aceito os critérios mínimos abaixo de doaçãoo de sangue</label>
			    </div>    
				<div>
			        <p>Apresentar documento original com foto atualizada, que permita a identificação do candidato, emitido por orgão oficial.</p>
			
			        <p>Deve aguardar para doar sangue/afere-se quem:</p>
			        <ul>
			            <li>Viajou para fora de Santa Catarina nos últimos dias.</li>
			            <li>Pesa menos que 50 quilogramas.</li>
			            <li>Realizou alguma cirurgia recentemente.</li>
			            <li>Tomou alguma vacina nos últimos dias.</li>
			            <li>Fez tatuagem, micropigmentação, piercing, etc. nos últimos 6 meses.</li>
			            <li>Teve contato com alguém com Covid nos últimos 10 dias.</li>
			            <li>Está com sintomas gripais (coriza, febre, tosse, dor de garganta).</li>
			        </ul>
			
			        <p>Em caso positivo para uma das situações acima, não efetue seu agendamento e entre em contato conosco.</p>
			    </div>
			</div>
	    </form>
	</div>
</body>

</html>