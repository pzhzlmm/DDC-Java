package cor.ex1.test;

import cor.ex1.connection.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 16:49
 * @description: OrderTest 类的主要功能为:
 */
public class OrderTest {
    /**
     * description: test
     * 当表的字段与类的属性不一致时,要在对应语句中使用类的属性名作为查询字段的别名
     * version: 1.0
     * date: 2020/3/28 16:55
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test() throws SQLException, IOException {
        Connection connection = JDBCUtils.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select order_id orderId,order_name orderName,order_date orderDate from `order` where order_id = ?";
        // You have an error in your SQL syntax; 一般这种情况是sql写的有问题
        //这里的问题是表名和关键字相重复了
        //后找不到对应的名字返回为空,可以取个别名(反射)
        BeanHandler<Order> handler = new BeanHandler<>(Order.class);
        Order query = queryRunner.query(connection, sql, handler, 1);
        System.out.println(query);
        JDBCUtils.close(connection);
    }
}
