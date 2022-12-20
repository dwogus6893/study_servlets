package com.dwogus6893.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.dwogus6893.study_servlets.DatasInfo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dispatcherJSP/TablesListServlets")
public class DispatcherJSPTablesListServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html; charset=UTF-8");
        DatasInfo datasInfo = new DatasInfo();
        ArrayList<String> tablesListWithString = datasInfo.getTableListWithString();
        HashMap<String, String> searchForm = datasInfo.getSearchFormData();
        
        //아래의 requestDispatcher쪽으로 넘겨줘서 
        request.setAttribute("tablesListWithString", tablesListWithString);
        request.setAttribute("searchForm", searchForm);

        RequestDispatcher requestDispatcher =  request.getRequestDispatcher("/tables_list.jsp");
        requestDispatcher.forward(request, response);
    
    }
}
