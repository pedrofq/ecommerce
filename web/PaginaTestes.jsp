<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.List"%>
<%@page import="com.pedro.domain.Produto"%>
<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="com.pedro.service.ProdutoService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%  
           
            ProdutoService ps = new ProdutoService();
            Integer id_produto = ps.registrarProduto("PRODUTO TESTE", "Link", 10000.00, 20);
            Integer id = ps.registrarProdutoProCategoria(id_produto, 1);
            System.out.println(id);
            id = ps.registrarProdutoProCategoria(id_produto, 2);
            System.out.println(id);
            
            
           
            
            
            
        %> 
              
        
    </body>
</html>
