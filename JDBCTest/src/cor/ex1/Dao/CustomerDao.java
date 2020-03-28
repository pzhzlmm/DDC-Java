package cor.ex1.Dao;

import cor.ex1.bean.Customer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * version: 1.0
 * 提供了操作customers的常用操作
 * @author XinLan Wang
 * @create 2020-03-28 16:14
 * @description: CustomerDao 类的主要功能为:
 */
public interface CustomerDao {
    public void add(Connection conn, Customer cust) throws SQLException;
    public int deleteById(Connection conn, int id) throws SQLException;
    public int updateCustomer(Connection conn, Customer cust) throws SQLException;
    public Customer getCustomer(Connection conn, int id) throws SQLException;
    public List<Customer> getAll(Connection conn) throws SQLException;
    public long size(Connection conn) throws SQLException;
    public Date getMaxBirth(Connection conn);
}
