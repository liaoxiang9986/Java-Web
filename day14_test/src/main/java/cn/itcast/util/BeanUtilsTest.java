package cn.itcast.util;

import cn.itcast.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;


public class BeanUtilsTest {

    @Test
    public void test()  {
        User user = new User();
        try {

            BeanUtils.setProperty(user,"username","张三");
            BeanUtils.setProperty(user,"password","1234");
            String username = BeanUtils.getProperty(user, "username");


        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(user);


    }


}
