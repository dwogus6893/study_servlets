package com.dwogus6893.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//웹서버가 어떤 것을 실행해야하는지 알려주는 경로다
@WebServlet(urlPatterns = "/helloWorldServlets")

public class HelloWorldServlets extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    String message = "Hello Wolrd Servlets with message!";
    PrintWriter printWriter =  response.getWriter();

    // http://localhost:8080/helloWorldServlets
    // 별칭 매칭 하는 이유는 ?
    // 자바 클래스가 외부가 노출되는 경로를 다 적기엔 불편하다, 그래서 매칭되는게 필요하다.
    //../java/com/yojulab/learn_servlets/HelloWorldServlets.class
        
    printWriter.println("<html lang='en'>");
    printWriter.println("<head>");
    printWriter.println("<title>"+message+"</title>");
    printWriter.println("</head>");
    printWriter.println("<body>");
    printWriter.println("<div>"+message+"</div>");
    printWriter.println("</body>");
    printWriter.println("</html>");

    printWriter.println("<div></div>");
    printWriter.close();    
}
}
    
