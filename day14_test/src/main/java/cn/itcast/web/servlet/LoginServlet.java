package cn.itcast.web.servlet;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、设置编码
        req.setCharacterEncoding("utf-8");
        //2、获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //3、封装User对象
        User loginuser = new User();
        loginuser.setPassword(password);
        loginuser.setUsername(username);
///这里要记得把lib文件放到webapp-WEB-INF下面  不然一直报错，没有页面跳转
        UserDao userDao = new UserDao();
        //4、调用userDao的login方法
        User user = userDao.login(loginuser);
        //5、判断user
        if (user== null){
            //登录失败
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }else   {
            //登录成功 存储数据
            req.setAttribute("user",user);
            //转发
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }
        System.out.println(user);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req, resp);
    }
}
