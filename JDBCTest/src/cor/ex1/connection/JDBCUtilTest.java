package cor.ex1.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 11:56
 * @description: JDBCUtilTest 类的主要功能为:
 */
public class JDBCUtilTest {
    public static void main(String[] args) throws IOException, SQLException {
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
    }
}
