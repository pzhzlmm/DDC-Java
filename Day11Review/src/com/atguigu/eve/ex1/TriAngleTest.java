/**  
 * @Title:  TriAngleTest.java   
 * @Package com.atguigu.eve.ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午7:13:58   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex1;

/**   
 * @ClassName:  TriAngleTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午7:13:58   
 *     
 */
public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle t1 = new TriAngle();
		
		t1.setBase(2.3);
		t1.setHeight(3.4);
		
		double area1 = t1.findArea();
		System.out.println("三角形1的面积为:" + area1);
		
		TriAngle t2 = new TriAngle(3,4);
		System.out.println("三角形2的面积为:" + t2.findArea());
	}
}
