package com.dwogus6893.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//웹서버가 어떤 것을 실행해야하는지 알려주는 경로다
@WebServlet(urlPatterns = "/dispatcherServlets")

public class DispatcherServlets extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
   String hiddenParam = request.getParameter("hiddenParam");

   //normal display
    String message = "DispatcherServlets with message!";
    PrintWriter printWriter =  response.getWriter();
        
    printWriter.println("<html lang='en'>");
    printWriter.println("<head>");
    printWriter.println("<title>"+message+"</title>");
    printWriter.println("</head>");
    printWriter.println("<body>");
    printWriter.println("<button>call DispatcherServlets</button>");
    printWriter.println("</body>");
    printWriter.println("</html>");

    printWriter.println("<div></div>");
    printWriter.close();    
}
}
    
