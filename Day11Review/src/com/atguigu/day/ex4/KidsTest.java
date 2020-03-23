/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  KidsTest.java   
 * @Package com.atguigu.ex.ex2   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午3:10:03   
 * @version V1.0 
 */ 
package com.atguigu.day.ex4;

/**   
 * @ClassName:  KidsTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午3:10:03   
 * (3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid，
 * 用该对象访问其父类的成员变量及方法。
 */
public class KidsTest {
	public static void main(String[] args) {
		Kids somekid = new Kids();
		somekid.sex = 1;
		somekid.salary = 0;
		somekid.manOrWoman();
		somekid.employeed();
	}
}
