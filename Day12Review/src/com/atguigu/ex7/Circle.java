/**  
 * @Title:  Circle.java   
 * @Package com.atguigu.ex7   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午2:51:06   
 * @version V1.0 
 */
package com.atguigu.ex7;

/**
 * @ClassName: Circle
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020年2月29日 下午2:51:06
 * 
 */
public class Circle extends GeometricObject {

	double radius;

	/**
	 * @param color
	 * @param weight
	 * @param radius
	 */
	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}

	/**
	 * @param color
	 * @param weight
	 */
	public Circle(String color, double weight) {
		super(color, weight);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return Math.PI * Math.PI * radius;
	}

}
