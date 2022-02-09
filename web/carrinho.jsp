<%@page import="com.pedro.domain.CarrinhoCompraItem"%>
<%@page import="java.util.List"%>
<%@page import="com.pedro.domain.Carrinho"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
       List<CarrinhoCompraItem> carrinhoCompraItens = (List<CarrinhoCompraItem>) request.getAttribute("carrinhoCompraItens");
%>

<html>
    <head>
        <title>Produtos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="CSS/style__css__cadastro.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">

       

    </head>

    <body class="container2">
        <h1>Carrinho</h1>
        
        <%
        for(CarrinhoCompraItem item : carrinhoCompraItens){
            
        %>
            <%=item.getProduto().getDescricao()%>
            <%=item.getProduto().getPreco()%>   
            <%=item.getProduto().getQuantidade()%>   
        <%}%>
             
       
    </body>
    
</html>

