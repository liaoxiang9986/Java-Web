package cn.itcast.servlet.itcast.web.requset;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo6")
public class RequestDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //get获取请求参数
//        i. String  getParameter(String name) 根据参数名称获取参数值
//        ii. String[]  getParameterValues(String name) 根据参数名称获取参数值的数组 hobby=xx&hobby=game   【通过一个键可以获取多个值】
//        iii. Enumeration<E>  getParameterNames() ：获取所有请求的参数名称
//        Map<String,String[]> getParameterMap() ：获取所有参数的map结合
//        String username = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(username);
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        post获取请求参数
//        String username = request.getParameter("username");
//        System.out.println("post");
//        System.out.println(username);

        //String[]  getParameterValues(String name) 根据参数名称获取参数值的数组
//        String[] hobbies = request.getParameterValues("hobby");
//        for (String hobby : hobbies) {
//            System.out.println(hobby);
//        }

        //获取所有请求的参数名称
//        Enumeration<String> parameterNames = request.getParameterNames();
//        while (parameterNames.hasMoreElements()) {
//            String name = parameterNames.nextElement();
//           String values = request.getParameter(name);
//            System.out.println(name+"--->"+values);
//            System.out.println("********---------------");
//        }

        //获取所有参数的map结合
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> keys = parameterMap.keySet();
        for (String key : keys) {
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.println(key+"--->"+value);
            }
            System.out.println("--------------");
        }

    }
}
