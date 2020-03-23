/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Person.java   
 * @Package com.atguigu.ex.ex1   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午2:55:20   
 * @version V1.0 
 */ 
package com.atguigu.day.ex3;

/**   
 * @ClassName:  Person   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午2:55:20   
 *     
 */
public class Person {
	String name;
	char sex;
	int age;
	/**
	 * @param name
	 * @param sex
	 * @param age
	 */
	public Person(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
