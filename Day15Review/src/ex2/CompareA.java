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
public interface CompareA {
	public static void method1(){
		System.out.println("BEIJING");
	}//ȥ��static����
	public default void method2(){
		System.out.println("shanghai");
	}//public��ȥ��,default������
	default void method3(){
		System.out.println("yangzhou");
	}//Ҳ��public,ֻ�Ǳ�ʡ����
}