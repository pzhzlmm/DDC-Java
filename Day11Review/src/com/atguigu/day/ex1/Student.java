package com.atguigu.day.ex1;
/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Student.java   
 * @Package    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: XinLan Wang   
 * @date:   2020年2月28日 上午11:28:07   
 * @version V1.0 
 */

/**   
 * @ClassName:  Student   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 上午11:28:07   
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
		System.out.println("吃饭");
	}
	public void walk(){
		Sysstem.out.println("走路");
	}*/
	public void study(){
		System.out.println("好好学习,天天向上");
	}
}
