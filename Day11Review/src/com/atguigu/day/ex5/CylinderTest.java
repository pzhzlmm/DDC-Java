/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  CylinderTest.java   
 * @Package com.atguigu.ex.ex3   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����3:17:49   
 * @version V1.0 
 */ 
package com.atguigu.day.ex5;

/**   
 * @ClassName:  CylinderTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����3:17:49   
 *     
 */
public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();
		cylinder.setRadius(2.0);
		cylinder.setLength(3.0);
		System.out.println(cylinder.findVolume());
	}
}