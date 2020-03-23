/**  
 * @Title:  InterfaceTest.java   
 * @Package ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 下午2:06:57   
 * @version V1.0 
 */ 
package ex2;

/**   
 * @ClassName:  InterfaceTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 下午2:06:57   
 *     
 */
public class InterfaceTest {
	public static void main(String[] args) {
		//静态随着接口的加载而加载
		//就可通过接口调用其内部的静态方法
		//非静态的方法则不可以调了
		CompareA.method1();
//		SubClass.method1()
//		不可以调用method1,接口中的静态只能自己调用,实现类是不可以调用的
		SubClass sub = new SubClass();
		sub.method2();
		sub.method3();
		//如果实现类重写了默认中的接口方法,那么实现类调用的就是重写方法
		
		sub.method4();
		//接口父类重名,如果子类没重写,那么默认调用的是父类的方法
		//接口与接口之间存在冲突,但父类和接口之间有所不同
		
		System.out.println();
		sub.method();
	}
	
}
