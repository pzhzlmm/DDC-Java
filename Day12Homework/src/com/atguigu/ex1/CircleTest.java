/**  
 * @Title:  CircleTest.java   
 * @Package com.atguigu   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:10:45   
 * @version V1.0 
 */ 
package com.atguigu.ex1;

/**   
 * @ClassName:  CircleTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午9:10:45   
 *     
 */
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(9);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());;
	}
}
