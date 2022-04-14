package cn.itcast.dao;

import cn.itcast.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import cn.itcast.util.JDBCUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * 操作数据库中User表的类
 */

//@WebServlet("/demo1")
public class UserDao   {
    //声明JDBCTemplate对象公用
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    /**
     * 登录方法
     *
     * @param loginUser 只有用户名和密码
     * @return user包含用户的全部数据
     */

    public User login(User loginUser) {

        try {
            //1、写SQL
//            DataSource ds = JDBCUtils.getDataSource();
            String sql = "select * from user where username = ? and password = ?";
            //2、调用query方法
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());

            return user;
        }catch (Exception e ){
            e.printStackTrace();
            return null;
        }
    }

}
