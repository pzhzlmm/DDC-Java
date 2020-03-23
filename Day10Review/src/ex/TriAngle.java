package ex;
/**
 * 
 * @author motong
 *
 */
public class TriAngle {
	private double base;
	private double height;
	
	TriAngle(){}
	TriAngle(double base,double height){
		this.base = base;
		this.height = height;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
	public double getArea(){
		return base * height / 2;
	}
	/**
	 * 计算三角形面积
	 * @param base
	 * @param height
	 * @return
	 */
	
}
