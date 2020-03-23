/**  
 * @Title:  Person.java   
 * @Package com.atguigu.eve.ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午7:59:38   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex4;

/**   
 * @ClassName:  Person   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午7:59:38   
 *     
 */
public class Person extends Creature {
	String name;
	private int age;
	/**
	 * 
	 */
	public Person() {
		super();
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
	public void show(){
		System.out.println("name:" + name + ",age:" + age);
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
	public void info(){
		System.out.println("我是一个人");
	}
}
