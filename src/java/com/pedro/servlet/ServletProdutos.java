package com.pedro.servlet;

import com.google.gson.Gson;
import com.pedro.domain.Produto;
import com.pedro.domain.Usuario;
import com.pedro.service.ProdutoService;
import static com.pedro.service.UsuarioService.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "produtos",
        urlPatterns = {"/produtos"}
    )
public class ServletProdutos extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try{
            ProdutoService ps = new ProdutoService();
            List<Produto> listaProdutos = ps.buscarTodosProdutos();

            String json = new Gson().toJson(listaProdutos);
            System.out.print(json);
            
            String pagFoward = "produtos.jsp";       

            request.setAttribute("json", json);
            RequestDispatcher rd = request.getRequestDispatcher(pagFoward);
            rd.forward(request, response);
        }catch(Exception e){
        }
    }
}