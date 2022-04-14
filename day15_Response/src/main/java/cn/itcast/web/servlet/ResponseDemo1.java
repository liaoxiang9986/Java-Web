package cn.itcast.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/*
完成重定向
 */
@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println( "Demo1 被访问了");
        request.setAttribute("msg","response");
        //访问responseDemo1会自动跳转到responseDemo2资源
//        response.setStatus(302);
//        response.setHeader("location","/day15/responseDemo2");
        response.sendRedirect("/day15/responseDemo2");


    }
}
