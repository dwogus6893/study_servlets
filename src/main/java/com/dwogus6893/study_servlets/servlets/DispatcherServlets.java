package com.dwogus6893.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

    // 웹서버가 어떤 것을 실행해야하는지 알려주는 경로다
    // post쓰면 눈에 안보임 , get쓰면 눈에 보임
@WebServlet(urlPatterns = "/dispatcherServlets")
public class DispatcherServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String hiddenParam = request.getParameter("hiddenParam");

        // /dispatcherServlets?hiddenParam=searchFormServlet
        if ("searchFormServlet".equals(hiddenParam)){
            response.sendRedirect("/searchFormServlet");
        // /dispatcherServlets?hiddenParam=createCookieServlets
        } else if ("createCookieServlets".equals(hiddenParam)){
            request.setAttribute("firstName", "yojulab");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/cookies/createServlets");
            requestDispatcher.forward(request, response);
        } else {
            // /normal display
            String message = "DispatcherServlets with Message !";
            PrintWriter printWriter =  response.getWriter();

            printWriter.println("<html lang='en'>");
            printWriter.println("<head>");
            printWriter.println("<title>"+message+"</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<button>call DispatcherServlets</button>");
            printWriter.println("</form>");
            
            printWriter.println("</body>");
            printWriter.println("</html>");

            printWriter.close();
        }
    }
}