package com.pedro.servlet;

import com.pedro.domain.Usuario;
import static com.pedro.service.UsuarioService.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
        name = "login",
        urlPatterns = {"/login"}
    )
public class ServletLoginUsuario extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //ENTRADA DE DADOS
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
              
        Usuario user = buscarUsuarioLogin(login);
        String mensagem = "Login ou senha inválida";
        String pagFoward = null;
        
        //Usuário não existente, logo é feito o cadastro
        
            if(user == null){
            mensagem = "Login ou senha inválida";
            pagFoward = "loginJSP.jsp";
            }
            else{
                if(user.getSenha().equals(senha)){
                    HttpSession session = request.getSession();
                    session.setAttribute("usuario", user);
                    pagFoward = "transferenciaLogin.jsp";
                }else{
                    mensagem = "Login ou senha inválida";
                    pagFoward = "loginJSP.jsp";
                }
            } 
        request.setAttribute("mensagem", mensagem);
        RequestDispatcher rd = request.getRequestDispatcher(pagFoward);
        rd.forward(request, response);
    }
}