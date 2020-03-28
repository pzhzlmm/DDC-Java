package cor.ex1.bean;

import java.sql.Date;

/**
 * version: 1.0
 * ORM编程思想:对象关系映射
 * 数据库中的一个表与java中的一个类对应
 * 数据表的一行,相当于java类的一个对象,数据表的一列与java类中的一个属性对应
 * @author XinLan Wang
 * @create 2020-03-28 14:43
 * @description: Customer 类的主要功能为:
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private Date birth;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Customer(int id, String name, String email, Date birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    public Customer() {
    }
}
