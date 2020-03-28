package cor.ex1.connection;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 9:27
 * @description: ConnectionTest 类的主要功能为:
 */
public class ConnectionTest {
    @Test
    public void test(){
        //方式一???
        //获取连接的4个必备要素
        //1.提供Driver接口的实现类(sun)
        Driver driver = null;
        String driverName = "com.mysql.jdbc.Driver";

        //2.提供url,告知操作的是哪个数据库
        String url = "jdbc:mysql://localhost:3306/test";

        //3.提供用户名
        String name = "root";
        //4.提供密码
        String password = "660916";
        //2.注册驱动
//        Driver driver = (Driver) Class.forName(driverName).newInstance();
//        DriverManager.registerDriver(driver);
//        Class.forName(driverName)
        //3.获取连接
    }

    /**
     * description: test2 '对方式一的优化
     * version: 1.0
     * date: 2020/3/28 9:41
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test2() throws SQLException, ClassNotFoundException {
        //获取连接的4个必备要素
        //1.提供Driver接口的实现类(sun)
        Driver driver = null;
        String driverName = "com.mysql.jdbc.Driver";

        //2.提供url,告知操作的是哪个数据库
        String url = "jdbc:mysql://localhost:3306/test";

        //3.提供用户名
        String name = "root";
        //4.提供密码
        String password = "660916";
        //2.加载驱动
        Class.forName(driverName);//这句话也不用加了,会自动读取这个路径,但其他的数据库不会自动加载
        //底层已经帮我们注册了
        //mysql底层driver类中的静态代码块中会自动帮我们执行

        //3.获取连接
        Connection connection = DriverManager.getConnection(url, name, password);
        System.out.println(connection);
    }

    //方式三:对方式二进行优化
    @Test
    public void test3() throws SQLException, ClassNotFoundException, IOException {
        //获取连接的4个必备要素:通过配置文件进行获取
        //1.提供Driver接口的实现类(sun)
        Driver driver = null;
        Properties properties = new Properties();
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(is);
        String driverName = properties.getProperty("driverName");
        //2.提供url,告知操作的是哪个数据库
        String url = properties.getProperty("url");

        //3.提供用户名
        String name = properties.getProperty("name");

        //4.提供密码
        String password = properties.getProperty("password");

        //2.加载驱动
        Class.forName(driverName);//这句话也不用加了,会自动读取这个路径,但其他的数据库不会自动加载
        //底层已经帮我们注册了
        //mysql底层driver类中的静态代码块中会自动帮我们执行

        //3.获取连接
        Connection connection = DriverManager.getConnection(url, name, password);
        System.out.println(connection);
    }
}
