/**  
 * @Title:  ExtendsTest.java   
 * @Package com.atguigu.eve.ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����8:08:04   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex4;

/**   
 * @ClassName:  ExtendsTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����8:08:04   
 *     
 */
public class ExtendsTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "��ܰ��";
		s.setAge(21);
		s.major = "����ý�弼��";
		s.study();
		s.eat();
		s.walk();
		s.show();
		s.breath();
	}
}