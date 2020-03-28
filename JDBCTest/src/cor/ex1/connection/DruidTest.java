package cor.ex1.connection;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 10:47
 * @description: DruidTest 类的主要功能为:
 */
public class DruidTest {
    //未使用配置文件
    @Test
    public void test1() throws SQLException {
        //dataSource作为数据库连接池技术的起始点,要在不同的数据库连接池技术中心,获取此数据源的实现类
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
       dataSource.setPassword("660916");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        //配置其他参数
        dataSource.setInitialSize(8);
        dataSource.setMaxActive(100);
        //获取连接
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    //使用配置文件
    @Test
    public void test2() throws Exception {
        //1.加载配置文件
        Properties pros = new Properties();
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("druid.properties");
        pros.load(is);
        //2.使用配置文件,返回Datasource的一个实例
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pros);
        //3.通过配置文件获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    //练习
    public void test() throws Exception {
        //1.加载配置文件
        Properties properties = new Properties();
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        //2.通过配置文件返回一个DataSource实例
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //3.通过配置文件获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    //练习
    public void test3() throws Exception {
        //1.加载配置文件
        Properties properties = new Properties();
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        //2.使用配置文件返回一个datasource实例
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //3.通过配置文件获取练剑
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    //练习
    public void test4() throws Exception {
        Properties properties = new Properties();
        InputStream is = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        //
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    //练习
    public void test5() throws Exception {
        Properties properties = new Properties();
        InputStream is = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }
}
