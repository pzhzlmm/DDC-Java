/**  
 * @Title:  TriAngleTest.java   
 * @Package com.atguigu.eve.ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����7:13:58   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex1;

/**   
 * @ClassName:  TriAngleTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����7:13:58   
 *     
 */
public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle t1 = new TriAngle();
		
		t1.setBase(2.3);
		t1.setHeight(3.4);
		
		double area1 = t1.findArea();
		System.out.println("������1�����Ϊ:" + area1);
		
		TriAngle t2 = new TriAngle(3,4);
		System.out.println("������2�����Ϊ:" + t2.findArea());
	}
}