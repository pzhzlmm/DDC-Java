package ex;
/**
 * 
 * @author motong
 *(1)����Student��,��4�����ԣ�
    String name; 
    int age; 
    String school;  
    String major;
(2)����Student���3��������:
��һ��������Student(String n, int a)�������name��age���ԣ�
�ڶ���������Student(String n, int a, String s)�������name, age ��school���ԣ�
������������Student(String n, int a, String s, String m)
�������name, age ,school��major���ԣ�
(3)��main�����зֱ���ò�ͬ�Ĺ����������Ķ��󣬲����������ֵ��
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
