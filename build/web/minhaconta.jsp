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
        <title>Minha Conta</title>  
    </head>
    <body id="container">
        
        <div>
            <h1>Meus dados</h1>
            <div>Nome: <%= user.getNome()%></div>
            <div>Endereço: <%= user.getEndereco()%></div>
            <div>E-mail: <%= user.getEmail()%></div>
            
            <h1>Ações</h1>
            <a href="alterardados.jsp"><p>Alterar dados da conta</p></a>
            <a href="historicocompras.jsp"><p>Ver histórico de compras</p></a>  
        </div>
        
    </body>
</html>
