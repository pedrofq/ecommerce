<%@page import="com.pedro.service.UsuarioService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação cadastro</title>
        <script defer src="./script/confirmacaocadastro.js"></script>  
        <link rel="stylesheet" type="text/css" href="./style__css__cadastro.css">
    </head>
    <body>
        <div id="telaCon"></div>
        <script>
        <%  
            String nome = request.getParameter("nome");
            String endereco = request.getParameter("endereco");
            String email = request.getParameter("email");
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            

            UsuarioService us = new UsuarioService();
            //Retorna 1 se a operação foi feita com sucesso ou, se não, retorna 0
            Integer i = us.registrar(nome, endereco, email, login, senha);
            System.out.println(i);
            
            
              
        %>  
        if(<%=i%> == 1){
            document.getElementById("telaCon").innerHTML='<object type="text/html" data="consulta.html" ></object>';
        }
        else{
            
        }
        </script>   
        
        
    </body>
</html>
