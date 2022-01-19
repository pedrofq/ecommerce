<%@page import="com.pedro.domain.Produto"%>
<%@page import="java.util.List"%>
<%@page import="com.pedro.service.ProdutoService"%>
<%@page import="com.pedro.domain.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Página do Administrador</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script defer src="./script/acoesRegistrarUsuario.js"></script>  
        <link rel="stylesheet" type="text/css" href="CSS/style__css__cadastro.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">
    </head>
    
  <%
    Usuario user = (Usuario) session.getAttribute("usuario");
    if(user == null || user.getAdministrador().equals("false")){
        request.setAttribute("mensagem", "Permissão negada");
        RequestDispatcher rd = request.getRequestDispatcher("indexlogin.jsp");
        rd.forward(request, response);
    }else{

%>
    
    <body id='container'>
        <div>
            <h2>Todos os produtos: </h2>
            <%ProdutoService ps = new ProdutoService();
            List<Produto> produtos = ps.buscarTodosProdutos();
            for(Produto produto : produtos){  
             %>       
             <div>ID = <%= produto.getId()%>, <%= produto.getDescricao()%>, PREÇO = <%= produto.getPreco()%>, QNT = <%= produto.getQuantidade()%></div>
            
            <%}%>
            
        </div>
            
        <div>
            <h2>Deletar Produto: </h2>
                <form id="form" method="post" action="/site_teste_1/deletarProduto">       
                <label for="deletar"> <p>Digite o ID do produto para deletar: </p> </label>
                <input type="text" name="deletar" size="10" id="deletar" required> 
                
                <p>
                    <input class="form-submit" type="submit" value="Deletar Produto">
                </p>
                </form>

        </div>
            <br>
            
        <div>
            <form id="form" method="post" action="/site_teste_1/cadastroProduto">       
                <h2>Registrar Produto:</h2>
                <label for="descricao"> <p>Descrição</p> </label>
                <input type="text" name="descricao" size="70" id="descricao" required>       
                
                <label for="foto"> <p>Foto</p> </label>
                <input type="text" name="foto" size="70" id="foto">
                
                <label for="preco"> <p>Preço</p> </label>
                <input type="text" name="preco" size="10" id="preco" required>
                
                <label for="quantidade"> <p>Quantidade</p> </label>
                <input type="text" name="quantidade" size="10" id="quantidade" required>
                
                <p>
                    <input class="form-submit" type="submit" value="Cadastrar Produto">
                </p>
            </form>
        </div>
    </body>
</html>
<%}%>