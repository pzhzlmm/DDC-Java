/**  
 * @Title:  CompareA.java   
 * @Package ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����2:04:57   
 * @version V1.0 
 */ 
package ex2;

/**   
 * @ClassName:  CompareA   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��4�� ����2:04:57   
 *     
 */
public interface CompareB {
	default void method3(){
		System.out.println("shenzhen");
	}//Ҳ��public,ֻ�Ǳ�ʡ����
	public default void method4(){
		System.out.println("lanzhou");
	}
}