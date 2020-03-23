package com.atguigu.day.ex1;
/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Person.java   
 * @Package    
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: XinLan Wang   
 * @date:   2020年2月28日 上午11:28:00   
 * @version V1.0 
 */

/**   
 * @ClassName:  Person   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 上午11:28:00   
 *     
 */
public class Person extends Creature{
	String name;
	int age;
	public Person(){}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println("吃饭");
	}
	public void walk(){
		System.out.println("走路");
	}
	

}
