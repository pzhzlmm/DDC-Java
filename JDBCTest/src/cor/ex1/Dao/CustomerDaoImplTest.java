package cor.ex1.Dao;

import cor.ex1.bean.Customer;
import cor.ex1.connection.JDBCUtils;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 16:36
 * @description: CustomerDaoImplTest 类的主要功能为:
 */
public class CustomerDaoImplTest {
    @Test
    public void test() throws IOException, SQLException {

        CustomerDaoImpl imp1 = new CustomerDaoImpl();
        Connection connection = JDBCUtils.getConnection();
        Customer cust = new Customer(4, "邓少东", "10@126.com", new Date(23829332L));
        imp1.add(connection,cust);
        JDBCUtils.close(connection);
    }

    //???没来得及写
    @Test
    public void test2(){
        
    }
    
    @Test
    public void testgetall(){


    }
}
