/**  
 * @Title:  SubClass.java   
 * @Package ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 下午2:08:34   
 * @version V1.0 
 */ 
package ex2;

/**   
 * @ClassName:  SubClass   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 下午2:08:34   
 *     
 */
public class SubClass extends SuperClass implements CompareA,CompareB{
	
	//default要删掉,这里被认为是重写了接口中的method2方法
	public  void method2(){
		System.out.println("南京");
	}

	/* (non-Javadoc)
	 * @see ex2.CompareB#method3()
	 */
	@Override
	public void method3() {
		// TODO Auto-generated method stub
//		System.out.println("广州);;
	}
	
	//Duplicate default methods named method3 with the parameters () and () are inherited from the types CompareB and CompareA
	//两个方法重名必须重写
	
	public void method4() {
		System.out.println("广州");
	}
	
	public void method(){
		method4();
		super.method4();
		CompareA.super.method3();
		CompareB.super.method3();
		//用别的接口中的方法
	}
	
}
