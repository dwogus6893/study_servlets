package com.dwogus6893.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/helloWorldServlets")
public class HelloWorldServlets extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    String message = "Hello WolrdServlets with message";
    PrintWriter printWriter =  response.getWriter();

    //http://localhost:8080/helloWorldServlets
    //별칭 매칭
    //../java/com/yojulab/learn_servlets/HelloWorldServlets.class
        
    printWriter.println("<html lang='en'>");
    printWriter.println("<head>");
    printWriter.println("<title>"+message+"</title>");
    printWriter.println("</head>");
    printWriter.println("<body>");
    printWriter.println("<div>"+message+"</div>");
    printWriter.println("</body></html>");

    printWriter.println("<div></div>");
    printWriter.close();    
}
}
    
