package cn.itcast.servlet.itcast.web.requset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/RequestDemo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据
        //1、获取请求头的名称
        String agent = request.getHeader("user-agent");
        System.out.println(agent);
        if (agent.contains("Chrome")){
            System.out.println("谷歌浏览器在访问！！~~~");
        }else if (agent.contains("Firefox")){
            System.out.println("火狐浏览器~~！！·~~  ");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
