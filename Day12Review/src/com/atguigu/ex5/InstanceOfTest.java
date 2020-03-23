/**  
 * @Title:  InstanceOfTest.java   
 * @Package com.atguigu.ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午2:22:18   
 * @version V1.0 
 */ 
package com.atguigu.ex5;

import java.util.Date;

/**   
 * @ClassName:  InstanceOfTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午2:22:18   
 *     
 */
public class InstanceOfTest {
	public static void main(String[] args) {
//		编译通过,运行不过的情况
		Person p1 = new Woman();
//		Man man = (Man)p1;
//		java.lang.ClassCastException
		
//		Person p2 = new Person();
//		Man man2 = (Man)p2;
//		ClassCastException
		
		//能过
		Woman woman1 = (Woman)p1;
		
		Object obj = new Man();
		Person p = (Person)obj;
		
//		//编译不通过
//		Man m1 = new Man();
//		Woman w = (Woman)m1;
//		男女没继承关系
		
		String str = "hello";
//		Date date = (Date)str;
//		没有子父类关系,根本转不了
		
//		Object obj1 = str;
//		Date date1 = (Date)obj1;
//		编译能过,运行过不了,因为两个类没关系
//		java.lang.String cannot be cast to java.util.Date
		
		
	}
}
