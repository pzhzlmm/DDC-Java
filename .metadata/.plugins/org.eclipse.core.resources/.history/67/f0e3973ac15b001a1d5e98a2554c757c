/**  
 * @Title:  InterviewTest1.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月1日 下午9:30:43   
 * @version V1.0 
 */

/**   
 * @ClassName:  InterviewTest1   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月1日 下午9:30:43   
 *     
 */
public class InterviewTest1 {

	public static void main(String[] args) {
		Base base = new Sub();
		base.add(1, 2, 3); //sub_1

//		Sub s = (Sub)base;
//		s.add(1,2,3);
	}
}

class Base {
	public void add(int a, int... arr) {
		System.out.println("base");
	}
}

class Sub extends Base {

	public void add(int a, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("sub_1");
	}

//	public void add(int a, int b, int c) {
//		System.out.println("sub_2");
//	}

}
