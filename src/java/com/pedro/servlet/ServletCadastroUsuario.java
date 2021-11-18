package com.pedro.servlet;

import com.pedro.service.UsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
              
        UsuarioService us = new UsuarioService();
        //Retorna 0 se não for encontrado nenhum login com esse nome
        Integer x = us.buscarUsuario(login);
        
        //Caso não tenha login com esse nome
        if(x == 0){
            Integer i = us.registrar(nome, endereco, email, login, senha);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>App</title></head>");
            out.println("<body>Cadastro executado com sucesso!</body>");
            out.println("</html>");
            out.close();
        }
        //Caso tenha login com esse nome, erro
        else{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head><title>App</title></head>");
            out.println("<body>Cadastro não executado, login existente</body>");
            out.println("</html>");
            out.close();
        }
  
    }
}
