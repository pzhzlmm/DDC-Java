/**  
 * @Title:  ToStringTest.java   
 * @Package com.atguigu.ex8   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����4:54:28   
 * @version V1.0 
 */ 
package com.atguigu.ex8;

/**   
 * @ClassName:  ToStringTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��29�� ����4:54:28   
 *     
 */
public class ToStringTest {
	public static void main(String[] args) {
		User u1 = new User("Mary",12);
		System.out.println(u1.toString());
		System.out.println(u1);
		
		String str = new String("hello");
		System.out.println(str.toString());
		System.out.println(str);
	}
}