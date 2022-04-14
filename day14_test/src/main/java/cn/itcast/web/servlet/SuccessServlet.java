package cn.itcast.web.servlet;

import cn.itcast.domain.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先获取request域中共享的user对象
        User user = (User) request.getAttribute("user");

        if (user != null) {
            //给页面设置编码
            response.setContentType("text/html;charset=utf-8");

            response.getWriter().write("登录成功，" + user.getUsername() + "欢迎你！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
