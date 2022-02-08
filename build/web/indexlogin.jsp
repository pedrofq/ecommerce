<%
    Usuario user = (Usuario) session.getAttribute("usuario");
    if(user == null){
        request.setAttribute("mensagem", "Permissão negada");
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }else{

%>

<%@page import="com.pedro.domain.Usuario"%>
<!DOCTYPE html>

<html>
    <head>
        <title>E-commerce</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">
        <script>
        <script src='/script/cores.js'></script>
    </head>
    
    <header id="header-id"> 
        <h1>Projeto e-commerce</h1>
        <ul>
            <li>Bem vindo, <%=user.getNome()%>.</li>
            <%System.out.println(user.getAdministrador());
            if(user.getAdministrador()==true){%>
            <a href="paginaAdministrador.jsp" target="iFramePrincipal">Configurações de Administrador</a>
            <%}%> 
            <br>
            <a href="minhaconta.jsp" target="iFramePrincipal">Minha Conta</a>
            <br>
            <a href="logout">Sair</a>
        </ul>
    </header>
    
    <body id="container">
        
        <div id="area-central">
            
            <span class="menu-vertical">         
                <a href="carrinho.jsp" target="iFramePrincipal"> Meu carrinho </a>
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

<%}%>