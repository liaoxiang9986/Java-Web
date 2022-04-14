package cn.itcast.servlet.itcast.web.requset;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo8")
public class RequestDemo8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo8..............");
        request.setAttribute("msg","hello!");


//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RequestDemo8");
//        requestDispatcher.forward(request,response);
        request.getRequestDispatcher("/RequestDemo9").forward(request, response);

    }
}
