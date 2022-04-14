package cn.itcast.servlet.itcast.web.requset;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据
        //1、获取请求头的名称
        Enumeration<String> headerNames = request.getHeaderNames();
        //2、遍历
        while (headerNames.hasMoreElements()){
            //根据名称获取请求头的值
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            System.out.println(name+"---->"+value);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
