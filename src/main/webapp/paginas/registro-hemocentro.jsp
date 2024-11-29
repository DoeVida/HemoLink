<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro Hemocentro</title>
</head>
<body>
    <div class="RegistroHemocentro">
        <h1>Registre-se</h1>
        <form>
            <div class="NomeUsuario">
            	<div>
                	<label for="nome-usuario">Nome de Usuário:</label>
                </div>
                <div>
                	<input type="text" id="nome-usuario" name="nome-usuario">
                </div>
            </div>
            <div class="NomeHemocentro">
            	<div>
                	<label for="nome-hemocentro">Nome do Hemocentro:</label>
                </div>
                <div>
                	<input type="text" id="nome-hemocentro" name="nome-hemocentro">
                </div>
            </div>
            <div class="CNJP">
            	<div>
                	<label for="cnpj">CNPJ:</label>
                </div>
                <div>
                	<input type="text" id="cnpj" name="cnpj">
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
                	<label for="horario-de-inicio">Inicio Horário de Atendimento:</label>
                </div>
                <div>
                	<input type="time" id="horario-de-inicio" name="horario-de-inicio">
                </div>
            </div>
            <div class="FinalHorarioDeAtendimento">
            	<div>
                	<label for="horario-de-fim">Final Horário de Atendimento:</label>
                </div>
                <div>
                	<input type="time" id="horario-de-fim" name="horario-de-fim">
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
            <div class="Endereco">
            	<div>
                	<label for="endereco">Endereço:</label>
                </div>
                <div>	
                	<input type="text" id="endereco" name="endereco">
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
            <div class="Estado">
            	<div>
                	<label for="estado">Estado:</label>
                </div>
                <div>
                	<input type="text" id="estado" name="estado">
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
                	<input type="text" id="rua" name="rua">
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
                	<input type="text" id="cep" name="cep">
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