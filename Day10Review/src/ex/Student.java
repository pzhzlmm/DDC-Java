package ex;
/**
 * 
 * @author motong
 *(1)定义Student类,有4个属性：
    String name; 
    int age; 
    String school;  
    String major;
(2)定义Student类的3个构造器:
第一个构造器Student(String n, int a)设置类的name和age属性；
第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
第三个构造器Student(String n, int a, String s, String m)
设置类的name, age ,school和major属性；
(3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
 */
public class Student {
    private String name; 
    private int age; 
    private String school;  
    private String major;
    Student(){}
    Student(String n, int a){
    	this.age = a;
    	this.name = n;
    }
    Student(String n, int a, String s){
    	this.age = a;
    	this.name = n;
    	this.school = s;
    }
    Student(String n, int a, String s, String m){
    	this.age = a;
    	this.name = n;
    	this.school = s;
    	this.major = m;
    }
}
