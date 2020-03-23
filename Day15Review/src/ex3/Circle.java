/**  
 * @Title:  Circle.java   
 * @Package ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 下午3:03:32   
 * @version V1.0 
 */ 
package ex3;

/**   
 * @ClassName:  Circle   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 下午3:03:32   
 *     
 */
public class Circle {
	private double redius;

	/**
	 * @return the redius
	 */
	public double getRedius() {
		return redius;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [redius=" + redius + "]";
	}

	/**
	 * 
	 */
	public Circle() {
		super();
	}

	/**
	 * @param redius
	 */
	public Circle(double redius) {
		super();
		this.redius = redius;
	}

	/**
	 * @param redius the redius to set
	 */
	public void setRedius(double redius) {
		this.redius = redius;
	}
}
