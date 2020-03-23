package ex;

public class Rectangle {//矩形

	private double length;//长度
	private double width;//宽度
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length,double width){
		
	}
	//提供类的多个构造器
	
	//通过公共的get()和set()来获取、设置属性的值
	public void setLength(double l){
		length = l;
	}
	public double getLength(){
		return length;
	}
	
	public void setWidth(double w){
		width = w;
	}
	public double getWidth(){
		return width;
	}
	
	/**
	 * 
	 * @Description 返回矩形的面积
	 * @author shkstart
	 * @date 2020年2月26日上午11:03:34
	 * @return
	 */
	public double findArea(){
		return length * width;
	}
	
	/**
	 * 
	 * @Description 输出矩形的长度和宽度
	 * @author shkstart
	 * @date 2020年2月26日上午11:03:26
	 */
	public void printRectangle(){
		System.out.println("长度为：" + length + ",宽度为：" + getWidth());
	}
	
	//返回矩形的周长：略
}
