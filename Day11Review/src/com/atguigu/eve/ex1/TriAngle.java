/**  
 * @Title:  TriAngle.java   
 * @Package com.atguigu.eve.ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午7:10:46   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex1;

/**   
 * @ClassName:  TriAngle   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午7:10:46   
 *     
 */
public class TriAngle {
	private double base;
	private double height;
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * 
	 */
	public TriAngle() {
		super();
	}
	/**
	 * @param base
	 * @param height
	 */
	public TriAngle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	/**
	 * @param base
	 */
	public TriAngle(double base) {
		super();
		this.base = base;
	}
	
	public double findArea(){
		return getBase() * getHeight() / 2;
	}
}
