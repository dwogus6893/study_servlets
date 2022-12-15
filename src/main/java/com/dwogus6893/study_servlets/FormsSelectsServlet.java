package com.dwogus6893.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/FormsSelectsServlet")
public class FormsSelectsServlet extends HttpServlet{
    //client에게 줄 부분 작성
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    //PrintWriter는 client에게 값을 보내기위한 준비작업
    PrintWriter printWriter = response.getWriter();
    //기본부분
    String message = "form selects";

    printWriter.println("<html lang='en'>");    
    printWriter.println("<head>");
    printWriter.println("<title>"+message+"</title>");
    printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css' rel='stylesheet'");
    printWriter.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65' crossorigin='anonymous'>");
    printWriter.println("<link rel='stylesheet' href='./css/commons.css'>");
    printWriter.println("</head>");

    //body
    printWriter.println("<body>");
    printWriter.println("<div class='fs-3'>form selects</div>"); 
    printWriter.println("<div>"); 
    printWriter.println("<label for='' class='form-label'>select multiple</label>"); 
    printWriter.println("<select class='form-select' aria-label='' multiple>"); 
    printWriter.println("<option selected>Open this select menu</option>"); 
    printWriter.println("<option value=M01>One</option>"); 
    printWriter.println("<option value=M02 selected>Two</option>"); 
    printWriter.println("<option value=M03>Three</option>"); 
    printWriter.println("<option value=M04 selected>Four</option>"); 
    printWriter.println("<option value=M01>One</option>"); 
    printWriter.println("<option value=M02 selected>Two</option>"); 
    printWriter.println("<option value=M03>Three</option>"); 
    printWriter.println("<option value=M04 selected>Four</option>"); 
    printWriter.println("</select>"); 
    printWriter.println("</div>"); 

    printWriter.println("<div>"); 
    printWriter.println("<label for='' class='form-label'>select </label>"); 
    printWriter.println("<select class='form-select' aria-label=''>"); 
    printWriter.println("<option selected>Open this select menu</option>"); 
    printWriter.println("<option value=M01>One</option>"); 
    printWriter.println("<option value=M02 selected>Two</option>"); 
    printWriter.println("<option value=M03>Three</option>"); 
    printWriter.println("</select>"); 
    printWriter.println("</div>"); 

    //기본 부분
    printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
    printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
    printWriter.println("crossorigin='anonymous'></script>");
    printWriter.println("</body>");       
    printWriter.println("</html>");
    //자원 반납
    printWriter.close();
    } 
}
