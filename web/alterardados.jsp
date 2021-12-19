<%@page import="com.pedro.domain.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario user = (Usuario) session.getAttribute("usuario");
    if(user == null){ 
        request.setAttribute("mensagem", "Faça login para ver detalhes da conta");
        RequestDispatcher rd = request.getRequestDispatcher("loginJSP.jsp");
        rd.forward(request, response);
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/style__css__cadastro.css">
        <title>Alterar dados</title>  
    </head>
    <body id="container">
        
        <div>
            <form id="form" method="post" action="/site_teste_1/alterarDados">  
                
                <label for="nome"> <p>Nome</p> </label>
                <input type="text" name="nome" size="20" id="nome">
                
                <label for="endereco"> <p>Endereço</p> </label>
                <input type="text" name="endereco" size="20" id="endereco">
                
                <label for="email"> <p>E-mail</p> </label>
                <input type="text" name="email" size="20" id="email">
                <p>
                    <input class="form-submit" type="submit" value="Alterar Dados">
                </p>
            </form>
        </div>
        
    </body>
</html>