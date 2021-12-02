<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Cadastrar</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script defer src="./script/acoesRegistrarUsuario.js"></script>  
        <link rel="stylesheet" type="text/css" href="CSS/style__css__cadastro.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">
    </head>
    
    <% String mensagem = (String) request.getAttribute("mensagem");
       if(mensagem == null){
            mensagem = "";
       }
    %>
    
    <body id='container'>
        <div>
            <form id="form" method="post" action="/site_teste_1/cadastro">       
                
                <label for="nome"> <p>Nome</p> </label>
                <input type="text" name="nome" size="55" id="nome" required>       
                
                <label for="cpf"> <p>CPF</p> </label>
                <input oninput="mascara_cpf(this)" type="text" name="cpf" size="15" id="cpf">
                
                <label for="endereco"> <p>Endereço</p> </label>
                <input type="text" name="endereco" size="55" id="endereco" required>
                
                <label for="email"> <p>E-mail</p> </label>
                <input type="text" name="email" size="55" id="email" required>
                
                <label for="login"> <p>Login</p> </label>
                <input type="text" name="login" size="20" id="login" required>
                <span class="errorText"><%= mensagem%></span>
                
                <label for="senha"> <p>Senha</p> </label>
                <input type="password" name="senha" size="20" id="senha" required>
                
                <label for="senha2"> <p>Confirme a senha</p> </label>
                <input type="password" name="senha2" size="20" id="senha2" required>
                <div id="erroSenha" class="errorText">&nbsp</div>

                <p>
                    <input class="form-submit" type="submit" value="Cadastrar">
                </p>
            </form>
        </div>
    </body>
</html>
