/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedro.servlet;

import com.pedro.domain.Carrinho;
import java.io.IOException;
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
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
     
        
        
        int produtoId = Integer.parseInt(request.getParameter("produtoId"));
        System.out.print("TESTE"+produtoId);
        
        Cookie cookie = Carrinho.obterCookie(request);
        try {
            String novoValor = Carrinho.adicionarItem(produtoId, 1, cookie.getValue());
            cookie.setValue(novoValor);
        } catch (Exception ex) {
            Logger.getLogger(AdicionarCarrinhoCompraServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("cookie", cookie);
        RequestDispatcher rd = request.getRequestDispatcher("carrinho.jsp");
        rd.forward(request, response);
        
        
        
        
        /*
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        
        for(int i = 0; cookies != null && i < cookies.length; i++){
            if(cookies[i].getName().equals(Carrinho.CHAVE)){
                cookie = cookies[i];
                break;
            }
        }
        if(cookie == null){
            
        }
        
*/
         
    }
       
}

