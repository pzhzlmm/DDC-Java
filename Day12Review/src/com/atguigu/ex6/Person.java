/**  
 * @Title:  Person.java   
 * @Package com.atguigu.ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����2:44:30   
 * @version V1.0 
 */ 
package com.atguigu.ex6;

/**   
 * @ClassName:  Person   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��29�� ����2:44:30   
 *     
 */
public class Person {
	protected String name="person";
	protected int age=50;
	public String getInfo() {
	          return "Name: "+ name + "\n" +"age: "+ age;
	}
}