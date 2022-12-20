package com.dwogus6893.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


// /session/createServlet?username=yojub@password=1234
@WebServlet(urlPatterns="/session/getServlets")
public class GetSessionServlets extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset=UTF-8");        

        
        String username = request.getParameter("username");
        String password = request.getParameter("name:password");

        // display
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<div>Create Session Servlets</div>");

        // loin
        if(username.equals("yojulab") && password.equals("1234")){
           HttpSession httpSession =  request.getSession();
           httpSession.setAttribute ("username", httpSession);
           httpSession.setAttribute ("password", password);
           printWriter.println("<div>"+username+","+password+"</div>");
        }else {
            printWriter.println("<div>Failed</div>");
        }
                    
        printWriter.close();

    }

}
