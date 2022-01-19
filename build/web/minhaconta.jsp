<%@page import="com.pedro.domain.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="usuario" class="com.pedro.domain.Usuario" scope="session" />

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
            <div>Nome: <jsp:getProperty name="usuario" property="nome"/></div>
            <div>Endereço: <jsp:getProperty name="usuario" property="endereco"/></div>
            <div>E-mail: <jsp:getProperty name="usuario" property="email"/></div>
            
            <h1>Ações</h1>
            <a href="alterardados.jsp"><p>Alterar dados da conta</p></a>
            <a href="historicocompras.jsp"><p>Ver histórico de compras</p></a>  
        </div>
        
    </body>
</html>
