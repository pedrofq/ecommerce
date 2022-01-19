package com.pedro.servlet;

import com.pedro.domain.Produto;
import com.pedro.domain.Usuario;
import com.pedro.service.ProdutoService;
import static com.pedro.service.UsuarioService.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "cadastroProduto",
        urlPatterns = {"/cadastroProduto"}
    )
public class ServletCadastrarProduto extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        ProdutoService ps = new ProdutoService();
        
        //ENTRADA DE DADOS
        Produto prod = new Produto();
        prod.setDescricao(request.getParameter("descricao"));
        prod.setFoto(request.getParameter("foto"));
        
        Double preco = Double.parseDouble(request.getParameter("preco"));
        prod.setPreco(preco);
        
        Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
        prod.setQuantidade(quantidade);
        
        Integer idProduto = ps.registrarProduto(prod.getDescricao(), prod.getFoto(), prod.getPreco(), prod.getQuantidade());
       
        String mensagem = null;
        String pagFoward = null;
        
        if(idProduto != 0){
            mensagem = "ID do Produto = " + idProduto;
            pagFoward = "transferenciaCadastro.jsp";
        }
        
        else{
            mensagem = "Esse nome de login já existe";
            pagFoward = "cadastroJSP.jsp";
        }
        
        
        request.setAttribute("mensagem", mensagem);
        RequestDispatcher rd = request.getRequestDispatcher(pagFoward);
        rd.forward(request, response);
    }
}