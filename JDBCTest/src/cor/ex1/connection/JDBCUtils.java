package cor.ex1.connection;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 11:48
 * @description: JDBCUtils 类的主要功能为:
 */
public class JDBCUtils {
    private static  DataSource dataSource;
    static {
        //1.加载配置文件
        Properties pros = new Properties();
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pros.load(is);
            //2.使用配置文件,返回Datasource的一个实例
            dataSource = DruidDataSourceFactory.createDataSource(pros);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws IOException, SQLException {

        //3.通过配置文件获取连接
        Connection connection = dataSource.getConnection();
        return connection;
    }

    /**
     * description: close
     * 关闭连接的操作
     * version: 1.0
     * date: 2020/3/28 14:12
     * author: XinLan Wang
     *
     * @param connection
     * @return void
     */
    public static void close(Connection connection){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
