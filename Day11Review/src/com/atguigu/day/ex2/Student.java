package com.atguigu.day.ex2;
/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Student.java   
 * @Package    
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����11:28:07   
 * @version V1.0 
 */

/**   
 * @ClassName:  Student   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����11:28:07   
 *     
 */
public class Student extends Person{
//	String name;
//	int age;
	String major;
	/**
	 * @param name
	 * @param age
	 * @param major
	 */
	public Student(String name, int age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}
	/**
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		super();
	}
/*	public void eat(){
		System.out.println("�Է�");
	}
	public void walk(){
		Sysstem.out.println("��·");
	}*/
	public void study(){
		System.out.println("�ú�ѧϰ,��������");
	}
	/*public void walk(){
		System.out.println("ѧ����·");
	}*/
	/* (non-Javadoc)
		 * @see com.atguigu.review.Person#walk()
		 */
		@Override
		public void walk() {
			// TODO Auto-generated method stub
			super.walk();
		}
	public Student test(){
		return this;
	}
}