/**  
 * @Title:  CompareA.java   
 * @Package ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 下午2:04:57   
 * @version V1.0 
 */ 
package ex2;

/**   
 * @ClassName:  CompareA   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 下午2:04:57   
 *     
 */
public interface CompareB {
	default void method3(){
		System.out.println("shenzhen");
	}//也是public,只是被省略了
	public default void method4(){
		System.out.println("lanzhou");
	}
}
