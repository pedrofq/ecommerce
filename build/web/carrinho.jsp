<%@page import="com.pedro.domain.CarrinhoCompraItem"%>
<%@page import="java.util.List"%>
<%@page import="com.pedro.domain.Carrinho"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
        Cookie[] cookies = request.getCookies();
        Cookie cookie = cookies[0];
        for(int i = 0; cookies != null && i < cookies.length; i++){
            if(cookies[i].getName().equals(Carrinho.CHAVE)){
                cookie = cookies[i];
                break;
            }
        }
        
        List<CarrinhoCompraItem> carrinhoCompraItens = Carrinho.obterCarrinhoCompra(cookie.getValue());
        System.out.println(carrinhoCompraItens);
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
        TESTE
        
        <%
            for(CarrinhoCompraItem item : carrinhoCompraItens){
            
        %>
        <%=item%>    
        <%}%>
             
       
    </body>
    
</html>

