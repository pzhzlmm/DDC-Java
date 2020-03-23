/**  
 * @Title:  Circle.java   
 * @Package com.atguigu   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:05:38   
 * @version V1.0 
 */
package com.atguigu.ex1;

/**
 * @ClassName: Circle
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020年2月29日 下午9:05:38
 * 
 */
public class Circle extends GeometricObject {
	private double radius;

	/**
	 * 
	 */
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, double weight) {
		super(color, weight);
		// TODO Auto-generated constructor stub
		this.radius = radius;
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
	
	//求圆的面积
	public double findArea(){
		return Math.PI * Math.PI * radius;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
