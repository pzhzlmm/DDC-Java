/**  
 * @Title:  MyRectangle.java   
 * @Package com.atguigu.ex7   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午2:51:25   
 * @version V1.0 
 */
package com.atguigu.ex7;

/**
 * @ClassName: MyRectangle
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020年2月29日 下午2:51:25
 * 
 */
public class MyRectangle extends GeometricObject {
	double width;
	double height;

	/**
	 * @param color
	 * @param weight
	 * @param width
	 * @param height
	 */
	public MyRectangle(String color, double weight, double width, double height) {
		super(color, weight);
		this.width = width;
		this.height = height;
	}

	/**
	 * @param color
	 * @param weight
	 */
	public MyRectangle(String color, double weight) {
		super(color, weight);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	public double findArea() {
		return width * height;
	}

}
