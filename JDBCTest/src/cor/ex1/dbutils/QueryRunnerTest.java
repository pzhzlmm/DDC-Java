package cor.ex1.dbutils;

import cor.ex1.bean.Customer;
import cor.ex1.connection.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;
import sun.plugin2.main.server.ResultHandler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * version: 1.0
 *
 * 使用dbutils.jar中的QueryRunner类对数据库表中的CRUD操作
 * 增删改/查:前者可以不要返回值,后者一定要返回值
 * @author XinLan Wang
 * @create 2020-03-28 14:20
 * @description: QueryRunnerTest 类的主要功能为:
 */
public class QueryRunnerTest {
    @Test
    public void test() throws IOException, SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into customers(name,email,birth)values(?,?,?)";
        //提供带占位符的sql语句,?代表不确定,后面再进行填充
        //解析:字符串-->日期,simpledateformat,datatimeformater
        int insertcount = queryRunner.update(connection, sql, "23", "11@163.com", new Date(45646516465L));
        System.out.println("添加了" + insertcount);
        JDBCUtils.close(connection);
    }

    /**
     * description: test2
     * 删除操作
     * version: 1.0
     * date: 2020/3/28 14:34
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test2() throws IOException, SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnection();
        String sql = "delete from customers where id = ?";
        //提供带占位符的sql语句,?代表不确定,后面再进行填充
        //解析:字符串-->日期,simpledateformat,datatimeformater
        int deletecount = queryRunner.update(connection, sql, 8);
        System.out.println("删除了" + deletecount);
        JDBCUtils.close(connection);
    }

    /**
     * description: test3修改
     * version: 1.0 
     * date: 2020/3/28 14:38 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void test3() throws IOException, SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnection();
        String sql = "update customers set name = ? where id = ?";
        //提供带占位符的sql语句,?代表不确定,后面再进行填充
        //解析:字符串-->日期,simpledateformat,datatimeformater
        int updatecount = queryRunner.update(connection, sql, "Mary",19);
        System.out.println("修改了" + updatecount);
        JDBCUtils.close(connection);
    }


    /**
     * description: test4查询
     * ORM的编程思想,表对应类(JavaBean)
     * 查询表中的一条记录
     * version: 1.0 
     * date: 2020/3/28 14:41 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */
    @Test
    public void test4() throws IOException, SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnection();
        String sql = "SELECT id,NAME,email,birth FROM customers WHERE id = ?";
        //提供带占位符的sql语句,?代表不确定,后面再进行填充
        //解析:字符串-->日期,simpledateformat,datatimeformater
        BeanHandler<Customer> hander = new BeanHandler<>(Customer.class);
        //如果返回的数据对应的javabean的对象,则使用BeanHandler
        Customer query = queryRunner.query(connection, sql, hander,1);
        System.out.println("查到了" + query);
    }

    /**
     * description: test5返回多个对象,用个list去接收
     * version: 1.0 
     * date: 2020/3/28 14:55 
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test5()throws IOException, SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnection();
        String sql = "SELECT id,NAME,email,birth FROM customers WHERE id < ?";
        //提供带占位符的sql语句,?代表不确定,后面再进行填充
        //解析:字符串-->日期,simpledateformat,datatimeformater
        //现在要返回多条记录构成的list,有个叫beanlisthandler
        BeanListHandler<Customer> handler = new BeanListHandler<>(Customer.class);
        List<Customer> list = queryRunner.query(connection, sql, handler, 10);

        list.forEach(c -> System.out.println(c));
    }

    /**
     * description: test6也可以使用maphandler
     * version: 1.0 
     * date: 2020/3/28 15:14 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void test6()throws IOException, SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnection();
        String sql = "SELECT id,NAME,email,birth FROM customers WHERE id < ?";
        //提供带占位符的sql语句,?代表不确定,后面再进行填充
        //解析:字符串-->日期,simpledateformat,datatimeformater
        ResultSetHandler<Map<String,Object>> handler = new MapHandler();
        Map<String, Object> map = queryRunner.query(connection, sql, handler, 10);

        System.out.println(map);
    }

    /**
     * description: testGetValue
     * 查询表里的特殊值
     * version: 1.0
     * date: 2020/3/28 15:20
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void testGetValue() throws IOException, SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection connection = JDBCUtils.getConnection();
        String sql = "SELECT count(*) from customers";
        ScalarHandler handler = new ScalarHandler();//???加object报错
        long query = (long) queryRunner.query(connection, sql, handler);
        System.out.println(query);
        //???
    }

}
