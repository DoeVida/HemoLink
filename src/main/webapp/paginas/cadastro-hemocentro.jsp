<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro Hemocentro</title>
</head>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #fdf4e5;
    margin: 0;
    padding: 0;
    display: flex;
    min-height: 100vh;
}

.container {
    text-align: center;
}

.title {
    font-size: 2.5rem;
    color: #333;
    margin-bottom: 20px;
}

.form-container {
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    padding: 20px;
    width: 900px;
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 20px;
    position: relative;
}

form {
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    gap: 15px;
    width: 100%;
    justify-content: center;
    align-items: center;
}

label {
    font-size: 1rem;
    color: #333;
}

input, select {
    padding: 10px;
    font-size: 1rem;
    border: 1px solid #ccc;
    border-radius: 5px;
}

button {
    grid-column: span 2;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 1rem;
    cursor: pointer;
}

button:hover {
    background-color: #45a049;
}

h1{

}

.icon {
    width: 120px;
    height: auto;
    position: absolute;

}
</style>

<body>
    <h1>Registre-se</h1>
    <div class="form-container">
        
        <form>
            <div class="NomeUsuario">
            	<div>
                	<label for="nome-usuario">Nome de UsuÃ¡rio:</label>
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
                	<label for="horario-de-inicio">Inicio HorÃ¡rio de Atendimento:</label>
                </div>
                <div>
                	<input type="time" id="horario-de-inicio" name="horario-de-inicio">
                </div>
            </div>
            <div class="FinalHorarioDeAtendimento">
            	<div>
                	<label for="horario-de-fim">Final HorÃ¡rio de Atendimento:</label>
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
                	<label for="endereco">EndereÃ§o:</label>
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
                	<label for="numero">NÃºmero:</label>
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
                	<label for="confirmar-senha">ConfirmaÃ§Ã£o da Senha:</label>
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