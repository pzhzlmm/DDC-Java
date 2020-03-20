package cor._3tr;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.Serializable;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-20 16:58
 * @description: Person 类的主要功能为:
 * 要想自定义的类可序列化,则需要
 * 1.实现Serializable接口(没有抽象方法,标识接口)
 * 2.显示声明全句常亮serialVersionUID 唯一标志(不要用默认的,因为怕默认的更改对不上号了)
 * 3.要想序列化,其全部属性都得可序列化
 */
public class Person implements Serializable {
    static final long serialVersionUID = -6849794470754667710L;
    String name;
    int age;
    private Accout accout;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public class Accout implements Serializable{
        private double balance;
        static final long serialVersionUID = -684979447075455710L;

    }
}

