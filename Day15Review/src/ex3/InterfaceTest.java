/**  
 * @Title:  InterfaceTest.java   
 * @Package ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 下午3:34:03   
 * @version V1.0 
 */ 
package ex3;

/**   
 * @ClassName:  InterfaceTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 下午3:34:03   
 *     
 */
public class InterfaceTest {
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle();
		ComparableCircle c2 = new ComparableCircle();
		System.out.println(c1.compareTo(c2));
		
	}
}
