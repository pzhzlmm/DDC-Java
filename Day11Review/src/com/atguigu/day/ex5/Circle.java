/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Circle.java   
 * @Package com.atguigu.ex.ex3   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午3:13:10   
 * @version V1.0 
 */ 
package com.atguigu.day.ex5;

/**   
 * @ClassName:  Circle   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午3:13:10   
 *     
 */
public class Circle {
	double radius;

	/**
	 * 
	 */
	public Circle() {
		super();
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){
		return radius * radius * Math.PI;
	}
}
