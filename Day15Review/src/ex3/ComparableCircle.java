/**  
 * @Title:  ComparableCircle.java   
 * @Package ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 下午3:17:19   
 * @version V1.0 
 */ 
package ex3;

/**   
 * @ClassName:  ComparableCircle   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 下午3:17:19   
 *     
 */
public class ComparableCircle extends Circle implements CompareObjecta{

	/* (non-Javadoc)
	 * @see ex3.CompareObject#compareTo(java.lang.Object)
	 */
	
	public int compareTo(Object o) {
		if(o == this){
			return 0;
		}
		if(o instanceof ComparableCircle){
			ComparableCircle c = (ComparableCircle)o;
//			return (int)(this.getRedius() - c.getRedius());
//			不够精确,方法一:简单粗暴
//			if(this.getRedius() > c.getRedius()){
//				return 1;
//			}else if(this.getRedius() < c.getRedius()){
//				return -1;
//			}else{
//				return 0;
//			}
			return Double.compare(this.getRedius(), c.getRedius());
		}else{
			return -1;
		}
	}
	
}
