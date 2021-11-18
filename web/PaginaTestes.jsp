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
            Integer i = ps.buscarProdutoPorCategoria(1);
            
            
        %> 
              
        
    </body>
</html>
