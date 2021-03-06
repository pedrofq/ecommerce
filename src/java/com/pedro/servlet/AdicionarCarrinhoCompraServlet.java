/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedro.servlet;

import com.pedro.domain.Carrinho;
import com.pedro.domain.CarrinhoCompraItem;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pedro
 */
@WebServlet(name = "carrinho", urlPatterns = {"/carrinho"})
public class AdicionarCarrinhoCompraServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        for (int i = 0; cookies != null && i < cookies.length; i++) {
            if (cookies[i].getName().equals(Carrinho.CHAVE_COOKIE_CARRINHO_COMPRA)) {
                cookie = cookies[i];
                break;
            }
        }
        if (cookie == null) {
            cookie = new Cookie(Carrinho.CHAVE_COOKIE_CARRINHO_COMPRA, "");
        }
        cookie.setMaxAge(Integer.MAX_VALUE);
        response.addCookie(cookie);
        
       
        int produtoId = Integer.parseInt(request.getParameter("produtoId"));
        
 
        String novoValor;
        
        novoValor = Carrinho.adicionarItem(produtoId, 1, cookie.getValue());
        
        cookie.setValue(novoValor);
        /* saÃ­da */
        List<CarrinhoCompraItem> carrinhoCompraItens = Carrinho.obterCarrinhoCompra(cookie.getValue());
        System.out.println("Carrinho: "+carrinhoCompraItens);
        request.setAttribute("carrinhoCompraItens", carrinhoCompraItens);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("carrinho.jsp");
        requestDispatcher.forward(request, response);
    }

}
       

