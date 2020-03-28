package cor.ex1.Dao;

import cor.ex1.bean.Customer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-28 16:22
 * @description: CustomerDaoImpl 类的主要功能为:
 */
public class CustomerDaoImpl extends Dao implements CustomerDao{
    @Override
    public void add(Connection conn, Customer cust) throws SQLException {
        String sql = "insert into customer(name,emqil,birth) value(?,?,?)";
        update(conn,sql,cust.getName(),cust.getEmail(),cust.getBirth());
    }

    @Override
    public int deleteById(Connection conn, int id) throws SQLException {
        String sql = "delete from customers where id = ?";
        return  update(conn,sql,id);
    }

    @Override
    public int updateCustomer(Connection conn, Customer cust) throws SQLException {
        String sql = "update customers set name = ?,email = ?,birth = ? where id = ?";
        return update(conn,sql,cust.getName(),cust.getEmail(),cust.getBirth(),cust.getId());
    }

    @Override
    public Customer getCustomer(Connection conn, int id) throws SQLException {
        String sql = "select id,name,email,birth from customers where id = ?";
        return getInstance(conn,Customer.class,sql,id);
    }

    @Override
    public List<Customer> getAll(Connection conn) throws SQLException {
        String sql = "select id,name,email,birth from customers";
        return getForList(conn,Customer.class,sql);
    }

    @Override
    public long size(Connection conn) throws SQLException {
        return 0;
    }

    @Override
    public Date getMaxBirth(Connection conn) {
        return null;
    }

    /*???
    @Override
    public long size(Connection conn) throws SQLException {
        String sql = "select count(*) from customers";
        return getValue(conn,sql);
    }

    @Override
    public Date getMaxBirth(Connection conn) {
        String sql = "select max(birth) from customers";
        return getValue(conn,sql);
    }*/
}
