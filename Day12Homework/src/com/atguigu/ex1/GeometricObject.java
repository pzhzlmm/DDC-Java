/**  
 * @Title:  GeometricObject.java   
 * @Package com.atguigu   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:03:30   
 * @version V1.0 
 */ 
package com.atguigu.ex1;

/**   
 * @ClassName:  GeometricObject   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午9:03:30   
 *     
 */
public class GeometricObject {
	protected String color;
	protected double weight;
	/**
	 * 
	 */
	public GeometricObject() {
		super();
		color = "white";
		weight = 1.0;
	}
	/**
	 * @param color
	 * @param weight
	 */
	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
