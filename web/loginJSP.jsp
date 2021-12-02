<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>




<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script defer src="./script/acoes.js"></script>  
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
            <form id="form" method="post" action="/site_teste_1/login">  
                
                <label for="login"> <p>Login</p> </label>
                <input type="text" name="login" size="20" id="login" required>
                
                <label for="senha"> <p>Senha</p> </label>
                <input type="password" name="senha" size="20" id="senha" required>
                
                <p class="errorText"><%= mensagem%></p>
                
                <p>
                    <input class="form-submit" type="submit" value="Entrar">
                </p>
            </form> 
            <br>
            <p>
                Não possui conta?
                <a href="cadastroJSP.jsp">Criar agora!</a>
            </p>
            
        </div>
 
    </body>
</html>
