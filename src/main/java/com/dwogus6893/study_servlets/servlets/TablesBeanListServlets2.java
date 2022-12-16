package com.dwogus6893.study_servlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.dwogus6893.study_servlets.DatasInfo;
import com.dwogus6893.study_servlets.beans.MemberBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tablesBeanListServlets")
public class TablesBeanListServlets2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // 응답을 보낼 때 한글이 깨지지 않게 해주는 것. 백엔드를 위한 것

        // 여기서부터 액션을 취하는 부분
        DatasInfo datasInfo2 = new DatasInfo2();
        MemberBean memberBean2 = datasInfo2.getDataWithMemberBean();
        HashMap<String, Object> bundlesData = datasInfo2.getBundleData();

        System.out.println(memberBean2.getFirstName() + " " + memberBean2.getSecondName()
                + " " + memberBean2.getHandleName());

        // 여기까지

        // 여기서부터는 Display영역
        PrintWriter printWriter = response.getWriter();
        HashMap<String, String> searchForm = datasInfo2.getSearchFormData();

        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<meta charset='UTF-8'>");
        printWriter.println("<title>" + searchForm.get("search_key") + "</title>");
        printWriter.println("<link");
        printWriter.println("href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css'");
        printWriter.println("rel='stylesheet'");
        printWriter.println("integrity='sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65'");
        printWriter.println("crossorigin='anonymous'");
        printWriter.println("/>");
        printWriter.println("<link rel='stylesheet' href='./css/commons.css' />");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div class='container'>");
        printWriter.println("<div class='fs-3'>Tables With Bean</div>");
        // printWriter.println("<div class='fs-4'>" + memberBean.getFirstName() + " " +
        // memberBean.getSecondName()
        // + " " + memberBean.getHandleName() + "</div>");

        MemberBean MemberBean2 = (MemberBean) bundlesData.get("dataWithMemberBean");
        printWriter.println("<div class='fs-4'>" + MemberBean2.getFirstName() + " " + MemberBean2.getSecondName()
                + " " + MemberBean2.getHandleName() + "</div>");

        printWriter.println("<table class='table'>");
        printWriter.println("<thead>");
        printWriter.println("<tr>");
        printWriter.println("<th scope=>#</th>");
        // printWriter.println("<th scope=>First</th>");
        // printWriter.println("<th scope=>Last</th>");
        printWriter.println("<th scope=>Handle</th>");
        printWriter.println("</tr>");
        printWriter.println("</thead>");
        printWriter.println("<tbody>");

        ArrayList<MemberBean> dataListWithMemberBean = (ArrayList<MemberBean>) bundlesData.get("dataListWithMemberBean");

        for(int i=0; i<dataListWithMemberBean.size();i++){
            MemberBean MemberBean2 = dataListWithMemberBean.get(i);
            printWriter.println("   <tr>");
            printWriter.println("       <th scope=>"+(i+1)+"</th>");

            String handle = MemberBean2.getHandleName();
            printWriter.println("<td>"+MemberBean2.getFirstName()+"</td>");
            printWriter.println("<td>"+MemberBean2.getSecondName()+"</td>");
            printWriter.println("       <td>"+handle+"</td>");
            printWriter.println("   </tr>");
        }











        // for (int i = 0; i < tablesListWithString.size(); i++) {
        // printWriter.println("<tr>");
        // printWriter.println("<th scope=>" + (i + 1) + "</th>");
        // // printWriter.println("<td>Mark</td>");
        // // printWriter.println("<td>Otto</td>");
        // String handle = tablesListWithString.get(i);
        // printWriter.println("<td>" + handle + "</td>");
        // printWriter.println("</tr>");
        // }

        printWriter.println("</tbody>");
        printWriter.println("</table>");
        printWriter.println("</div>");

        printWriter.println("<script");
        printWriter.println("src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js'");
        printWriter.println("integrity='sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4'");
        printWriter.println("crossorigin='anonymous'");
        printWriter.println("></script>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        printWriter.close();
    }
}