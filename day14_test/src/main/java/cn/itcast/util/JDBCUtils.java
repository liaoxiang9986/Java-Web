package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类  使用Druid连接池
 */
public class JDBCUtils {
    private static DataSource ds;

    static {
        //1、加载配置文件
        try {
            Properties pro = new Properties();
//            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
//            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("src/main/druid.properties");
//            InputStream is =  JDBCUtils.class.getClassLoader().getResourceAsStream(
//                    "D:\\code\\web高级部分\\day14_test\\src\\main\\java\\cn\\itcast\\index.txt");
            InputStream is =  JDBCUtils.class.getClassLoader().getResourceAsStream(
                    "druid.properties");
            pro.load(is);  //我的运行之后这里报空指针异常  字节输入流is为空
            //初始化连接处对象
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取连接池对象
     */
    public static DataSource getDataSource() {
        return ds;
    }


    /**
     * 获取连接对象Connection
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
