package cn.itcast.servlet.itcast.web.requset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据
        //1、获取请求头的名称
        String referer = request.getHeader("referer");
        if (referer != null) {
            //练习防盗链
            if (referer.contains("day14")) {
                System.out.println("正常播放~~");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("正常播放~~");
            } else {
                System.out.println("想看电影吗？来优酷！！！~~~");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("想看电影吗？来优酷！！！~~~~~");
            }
        }


        System.out.println(referer);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
