/**  
 * @Title:  OuterClass1.java   
 * @Package ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 下午4:19:42   
 * @version V1.0 
 */ 
package ex4;

/**   
 * @ClassName:  OuterClass1   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 下午4:19:42   
 *     
 */
public class OuterClass1 {
	public void method(){
		//开发中比较少见
		class A{
			
		}
	}
	
	//返回接口实现类的对象
	public Comparable getComparable(){
//		class MyComparable implements Comparable{
//
//			/* (non-Javadoc)
//			 * @see java.lang.Comparable#compareTo(java.lang.Object)
//			 */
//			@Override
//			public int compareTo(Object o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			return snew MyComparable;
//	}
		//匿名实现类的匿名对象
		return new Comparable(){

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}//安卓中大量使用
		};
	}
}
