package com.atguigu.day.ex1;
/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  ExtendsTest.java   
 * @Package    
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����11:28:31   
 * @version V1.0 
 */

/**   
 * @ClassName:  ExtendsTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����11:28:31   
 *     
 */
public class ExtendsTest {
	public static void main(String[] args) {
		Person p1 = new Person("С��",17);
		p1.eat();
		p1.walk();
		
		Student s = new Student("С��",23,"�����");
		 s.study();
		 s.walk();
		 s.eat();
		 s.breath();
	}
}