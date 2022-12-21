package com.dwogus6893.study_servlets.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import com.dwogus6893.study_servlets.HttpsServlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/polls/PollServlet")
public class DetailServlets extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        // input type
        String questions_Uid = request.getParameter("QUESTIONS_UID");
        
        // biz with DB and Class
        
        // output with html
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.close();
    } 
}
