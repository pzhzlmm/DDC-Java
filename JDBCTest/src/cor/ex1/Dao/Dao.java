package cor.ex1.Dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 16:02
 * @description: Dao 类的主要功能为:
 */
public abstract class Dao {

    private QueryRunner queryRunner = new QueryRunner();

    /**
     * description: update通用的增删改操作
     * version: 1.0 
     * date: 2020/3/28 16:07 
     * author: XinLan Wang
     * 
     * @param conn
 * @param sql
 * @param args
     * @return int
     */ 
    public int update(Connection conn,String sql,Object ...args) throws SQLException {
        return queryRunner.update(conn,sql,args);
    }

    public <T> T getInstance(Connection conn,Class<T> clazz,String sql,Object ...args) throws SQLException {
        BeanHandler<T> handler = new BeanHandler<>(clazz);
        return queryRunner.query(conn,sql,handler,args);
    }
    public <T> List<T> getForList(Connection conn, Class<T> clazz, String sql, Object ...args) throws SQLException  {
        BeanListHandler<T> handler = new BeanListHandler<>(clazz);
        return queryRunner.query(conn,sql,handler,args);
    }
    public <T> Object getValue(Connection conn, String sql, Object ...args) throws SQLException  {
        ScalarHandler handler = new ScalarHandler();
        return (T)queryRunner.query(conn, sql, handler, args);

    }

}
