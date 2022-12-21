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

// 받아서 로그인 한 상태면 세션 만들고 로그인 안된 상태면 세션 만들지 X
// /session/createServlet?username=yojub@password=1234
@WebServlet(urlPatterns="/session/getServlets")
public class GetSessionServlets extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html; charset=UTF-8");        

       // display
       PrintWriter printWriter = response.getWriter();
       printWriter.println("<div>Create Session Servlets</div>");

       // login
       HttpSession httpSession =  request.getSession();
       String username = (String) httpSession.getAttribute("username");
       String password = (String) httpSession.getAttribute("password");
       
       // request로 들어오는 값은 null 체크를 꼭 해줘야 함
       printWriter.println("<div>"+username+","+password+"</div>");
      
       printWriter.close();

    }

}
