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

@WebServlet(
        name = "cadastro",
        urlPatterns = {"/cadastro"}
    )
public class ServletCadastroUsuario extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //ENTRADA DE DADOS
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String login = (request.getParameter("login")).toLowerCase();
        String senha = request.getParameter("senha");
              
        Usuario user = buscarUsuarioLogin(login);
        String mensagem = null;
        String pagFoward = null;
        
        //Usuário não existente, logo é feito o cadastro.
        if(user == null){
            Integer i = registrar(nome, endereco, email, login, senha);
            mensagem = "Cadastro executado com sucesso!";
            pagFoward = "transferenciaCadastro.jsp";
        }
        
        //Usuário já existe, volta para a tela de cadastro.
        else{
            mensagem = "Esse nome de login já existe";
            pagFoward = "cadastroJSP.jsp";
        }
        
        
        request.setAttribute("mensagem", mensagem);
        RequestDispatcher rd = request.getRequestDispatcher(pagFoward);
        rd.forward(request, response);
    }
}