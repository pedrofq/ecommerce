<%@page import="com.pedro.domain.Usuario"%>
<!DOCTYPE html>

<%
    Usuario user = (Usuario) session.getAttribute("usuario");
    if(user == null){ 
    }else{
        request.setAttribute("mensagem", "Login");
        RequestDispatcher rd = request.getRequestDispatcher("indexlogin.jsp");
        rd.forward(request, response);
    }

%>


<html>
    <head>
        <title>E-commerce</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">
        <script src='./script/cores.js'></script>
        
    </head>
    
    <header id="header-id">  
        <h1>Projeto e-commerce</h1>
        <ul><li id="logininf"><a href="loginJSP.jsp" target="iFramePrincipal">Faça login ou cadastre-se!</a></li></ul>
    </header>
    
    <body id="container">
        
        <div id="area-central">
            
            <span class="menu-vertical">         
                <a href="#" target="iFramePrincipal"> Meu carrinho </a>
                <a href="consulta.html" target="iFramePrincipal"> Categorias </a>
                <a href="produtos" target="iFramePrincipal"> Todos os produtos </a>
                <a href="PaginaTestes.jsp"> Alterar dados </a>
                <br><br><br>
                <label for="claro"> Modo Claro</label>
                <input type="radio" onclick="modificarCorFundo('#FFFFFF')" name="corFundo" value='claro'>
                <label for="escuro"> Modo Escuro </label>
                <input type="radio" checked="checked" onclick="modificarCorFundo('#1a1a1a')" name="corFundo" value='escuro'>
            </span>

            <span>
                <iframe id="iFramePrincipal" src="" name="iFramePrincipal">
                         
                </iframe>
            </span>
        
          
        </div>
        
    </body>
    <script>window.open("produtos","iFramePrincipal");</script>
</html>
