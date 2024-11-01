<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar Campanha</title>
</head>
<body>
    <header>
        <input type="text" placeholder="Pesquisar">
        <button>Registrar</button>
        <button>Entrar</button>
        <button>Perfil</button>
        </header>
     
    <h1>Cadastrar Campanha</h1>
    <form>
        <div class="titulo"></div>
        <label for="titulo">Título da Campanha</label>
        <input type="text" id="titulo" name="titulo" placeholder="60 palavras no Max">
    </div>
            <div class="descricao">
        <label for="descricao">Descrição da Campanha</label>
        <input type="text" id="descricao" name="campanha" placeholder="100 palavras no Max">
    </div>
           <div class="dataInicio">
        <label for="dataInicio">Data de Iníio</label>
        <input type="date" id="dataInicio" name="dataInicio" placeholder="Data InÃ­cio">
    </div>
         <div class="dataFim">
        <label for="dataFim">Data Final</label>
        <input type="date" id="dataFim" name="dataFim" placeholder="Data Final">
    </div>
        <div class="imagem">
        <label for="imagem">Imagem</label>
        <input type="file" id="imagem" name="imagem" accept="image/*">
    </div>
    

        <h2>Demanda</h2>

       <div class="tipoSanguineo">
        <label for="tipoSanguineo">Tipo Sanguíneo</label>
        <select id="tipoSanguineo" name="tipoSanguineo">
            <option>Selecionar</option>
            <!-- opcoes de tipos sanguineos -->
        </select>
    </div>
          <div clas="capacidade">
        <label for="capacidade">Capacidade</label>
        <select id="capacidade" name="capacidade">
            <option>Selecionar</option>
            <!-- opcoes de capacidade -->
        </select>
    </div>
           <div class="quantidadeLitros">
        <label for="quantidadeLitros">Quantidade de Litros</label>
        <input type="text" id="quantidadeLitros" name="quantidadeLitros" placeholder="...">
    </div>
         <div class="button">
        <button type="button">Cancelar Campanha</button>
        <button type="submit">Subir Campanha</button>
    </div>

    </form>
</body>
</html>
