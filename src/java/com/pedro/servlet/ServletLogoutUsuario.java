package com.pedro.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
        name = "logout",
        urlPatterns = {"/logout"}
    )
public class ServletLogoutUsuario extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        session.invalidate();
        
        request.setAttribute("mensagem", "Sessão encerrada");
        RequestDispatcher rd = request.getRequestDispatcher("transferenciaLogin.jsp");
        rd.forward(request, response);
    }
}