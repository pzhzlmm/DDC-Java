/**  
 * @Title:  Student.java   
 * @Package com.atguigu.eve.ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����8:03:44   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex4;

/**   
 * @ClassName:  Student   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����8:03:44   
 *     
 */
public class Student extends Person {
	String major;

	/**
	 * 
	 */
	public Student() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
//		super(name, age);
		this.name = name;
		setAge(age);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Student(String name, int age,String major) {
		this.name = name;
		setAge(age);
		this.major = major;
	}
	
	public void study(){
		System.out.println("�ú�ѧϰ����������");
	}
	
	
}