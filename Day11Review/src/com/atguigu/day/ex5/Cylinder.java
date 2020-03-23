/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Cylinder.java   
 * @Package com.atguigu.ex.ex3   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����3:15:03   
 * @version V1.0 
 */ 
package com.atguigu.day.ex5;

/**   
 * @ClassName:  Cylinder   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����3:15:03   
 *     
 */
public class Cylinder extends Circle{
	double length;

	/**
	 * 
	 */
	public Cylinder() {
		super();
		length = 1;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume(){
		return super.findArea() * length;
	}
	
	public double findArea(){
		return radius * radius * Math.PI * 2 + 2 * radius * Math.PI * length;
	}
	
}