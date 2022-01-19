<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cadastro efetuado</title>
        <link rel="stylesheet" type="text/css" href="CSS/style__css__cadastro.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">
    </head>
    <body class="container">
        <% String mensagem = (String) request.getAttribute("mensagem");
        if(mensagem == null){
             mensagem = "";
        }
        %>
        <h1>Cadastro efetuado com sucesso!</h1>
        <h1><%=mensagem%></h1>
    </body>
</html>
