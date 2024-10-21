<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Marque sua doação</title>
</head>

<body>
    <div class="Container">
        <h1>Doação de sangue</h1>

        <div class="SecaoInformacoesSaude">
            <h2>Informações de saúde</h2>
            <form action="#" method="post">
                <div class="Peso">
                    <label for="peso">Peso:</label>
                    <input type="number" id="peso" name="peso" placeholder="Mín...50kg" min="50" required>
                </div>

                <div class="tipoSanguineo">
                    <label for="Tipo Sanguíneo">Tipo Sanguíneo</label>
                    <select name="Tipo sanguíneo" id="Tipo sanguíneo" required>
                        <option value="">Selecione...</option>
                        <option value="A+">A+</option>
                        <option value="A-">A-</option>
                        <option value="O+">O+</option>
                        <option value="O-">O-</option>
                        <option value="AB+">AB+</option>
                        <option value="AB-">AB-</option>
                    </select>
                </div>

                <div class="DoencaCronica">
                    <label for="doenca-cronica">Possui alguma doença crônica?</label>
                    <select name="doenca-cronica" id="doenca-cronica" required>
                        <option value="">Selecionar...</option>
                        <option value="Sim">Sim</option>
                        <option value="Não">Não</option>
                    </select>
                </div>

                <div class="FebreGripal">
                    <label for="febre-gripal">Teve febre ou sintomas gripais nos últimos 30 dias?</label>
                    <select name="febre-gripal" id="febre-gripal" required>
                        <option value="Sim">Sim</option>
                        <option value="Não">Não</option>
                    </select>
                </div>
        </div>

        <div class="SecaoPreferenciasDoacao">
            <h2>Preferências de doação</h2>

            <div class="DoouAntes">
                <label for="doou-antes">Já doou sangue antes?</label>
                <select id="doou-antes" name="doou-antes" required>
                    <option value="">Selecionar...</option>
                    <option value="sim">Sim</option>
                    <option value="não">Não</option>
                </select>
            </div>

            <div class="UltimaDoacao">
                <label for="ultima-doacao">Se sim, quando foi a última vez?</label>
                <input type="date" id="ultima-doacao" name="ultima-doacao">
            </div>

            <div class="DataHora">
                <label for="data-hora">Melhor dia e horário para comparecer:</label>
                <input type="date" id="data-hora" name="data-hora" required>
                <input type="time" id="hora" name="data-hora" required>
            </div>

            <div class="LocalHemocentro">
                <label for="local-hemocentro">Local de hemocentro de preferência:</label>
                <select name="local-hemocentro" id="local-hemocentro" required>
                    <option value="">Selecionar...</option>
                    <option value="Florianópolis">Florianópolis</option>
                    <option value="Blumenau">Blumenau</option>
                    <option value="Joinville">Joinville</option>
                </select>
            </div>
        </div>

        <div class="SecaoCriterios">
            <Button type="submit">ENVIAR</Button>

            <div class="checkbox">
                <label>
                    <input type="checkbox" name="aceito" required>
                    Aceito os critérios mínimos abaixo de doação de sangue
                </label>
            </div>

            <div class="checkbox">
                <label>
                    <input type="checkbox" name="aceito" required>
                    Apresentar documento original com foto atualizada, que permita a identificação do candidato, emitido
                    por órgão oficial.
                </label>
            </div>
        </div>

        <div class="SecaoObservacoes">
            <p>Deve aguardar para doar sangue/afere-se quem:</p>
            <ul>
                <li>Viajou para fora de Santa Catarina nos últimos dias.</li>
                <li>Realizou alguma cirurgia recentemente.</li>
                <li>Tomou alguma vacina nos últimos dias.</li>
                <li>Fez tatuagem, micropigmentação, piercing, etc. nos últimos 6 meses.</li>
                <li>Teve contato com alguém com Covid nos últimos 10 dias.</li>
                <li>Está com sintomas gripais (coriza, febre, tosse, dor de garganta).</li>
            </ul>
            <p>Em caso positivo para uma das situações acima, não efetue seu agendamento e entre em contato conosco.</p>
        </div>

        </form>
    </div>

</body>

</html>