/**  
 * @Title:  ExtendsTest.java   
 * @Package com.atguigu.eve.ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午8:08:04   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex4;

/**   
 * @ClassName:  ExtendsTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午8:08:04   
 *     
 */
public class ExtendsTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "王馨兰";
		s.setAge(21);
		s.major = "数字媒体技术";
		s.study();
		s.eat();
		s.walk();
		s.show();
		s.breath();
	}
}
