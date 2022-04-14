package com.example.d13_tomcat4;

import javax.crypto.spec.PSource;
import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * Servlet的方法
 */
public class ServletDemo2  implements Servlet {
    //初始化方法，在servlet被创建的时候执行  ，只会执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init执行了....");
    }

    /**
     * 获取ServletConfig对象
     * Servlet的配置对象，需要我们自己去实现
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次Servlet被访问时 执行  多次访问就执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("访问了一下service哦~~廖翔 ~");
    }

    /**
     * 获取Servlet的一些信息：版本、作者等等
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时 执行  执行一次
     */
    @Override
    public void destroy() {
        System.out.println("--destroy执行----销毁了---");
    }
}
