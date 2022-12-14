package com.dwogus6893.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldServlets extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    //별칭 매칭
    //http://localhost:8080/helloWorldServlets
    //../java/com/yojulab/learn_servlets/HelloWorldServlets.class
    
    PrintWriter printWriter =  response.getWriter();
    
    printWriter.println("<html lang='en'>");
    printWriter.println("<head>");
    printWriter.println("<title>Hello WolrdServlets ! </title>");
    printWriter.println("</head>");
    printWriter.println("<body>");
    printWriter.println("<div>Hello WolrdServlets ! </div>");
    printWriter.println("</body></html>");

    printWriter.println("<div></div>");
    printWriter.close();    
}
}
    
