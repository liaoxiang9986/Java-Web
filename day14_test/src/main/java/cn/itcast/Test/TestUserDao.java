package cn.itcast.Test;

import cn.itcast.domain.User;
import cn.itcast.dao.UserDao;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.io.InputStream;
/*
    发现异常  过来调试一下

 */
public class TestUserDao {

    @Test
    public void testLogin() {
        UserDao userDao = new UserDao();

        User user = new User();
        user.setUsername("superman");
        user.setPassword("123");


        User loginUser = userDao.login(user);
        System.out.println(loginUser);

    }

    @Test
    public  void testURL(){
//        InputStream is = TestUserDao.class.getClassLoader().getResourceAsStream("/druid.properties");
//        InputStream is = TestUserDao.class.getClassLoader().getResourceAsStream("src/main/java/druid.properties");
//        InputStream is = TestUserDao.class.getClassLoader().getResourceAsStream("day14_test/src/main/java/druid.properties");
//        InputStream is = TestUserDao.class.getClassLoader().getResourceAsStream("druid.properties");

        Class<TestUserDao> testUserDaoClass = TestUserDao.class;
        ClassLoader classLoader = TestUserDao.class.getClassLoader();
        InputStream is = TestUserDao.class.getClassLoader().getResourceAsStream("/index.txt");

        System.out.println(testUserDaoClass);
        System.out.println(classLoader);
        System.out.println(is);
    }


}
