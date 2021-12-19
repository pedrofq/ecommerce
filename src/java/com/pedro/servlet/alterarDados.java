/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedro.servlet;

import com.pedro.domain.Usuario;
import com.pedro.service.UsuarioService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "alterarDados", urlPatterns = {"/alterarDados"})
public class alterarDados extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
            //ENTRADA DE DADOS
            HttpSession session = request.getSession();
            Usuario user = (Usuario) session.getAttribute("usuario");
            
            String nome = request.getParameter("nome");
            nome = nome.trim();
            
            String endereco = request.getParameter("endereco");
            endereco = endereco.trim();
            
            String email = request.getParameter("email");
            email = email.trim();
            
            //PROCESSAMENTO
            UsuarioService.alterarUsuario(nome, endereco, email, user);
            
        }
        catch(Exception e){
            
        }
    }
}