/**  
 * @Title:  SocreTest.java   
 * @Package ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月2日 下午2:18:45   
 * @version V1.0 
 */ 
package ex4;

import java.util.Scanner;
import java.util.Vector;

/**   
 * @ClassName:  SocreTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月2日 下午2:18:45   
 *     
 */
public class SocreTest {
	public static void main(String[] args) {
		//实例化Vector
		Vector v = new Vector();
		//实例化Scanner
		Scanner sc = new Scanner(System.in);
		int max = 0;
		for (;;) {
			int number = sc.nextInt();
			
			//如果输入的是负数,则跳出循环因子
			if(number < 0){
				break;
			}
			
			v.addElement(number);//内部涉及一个自动装箱
			if(max < number){
				max = number;
			}
			
		}
		char grade = '0';
		for (int i = 0; i < v.size(); i++) {
			Object elementAt = v.elementAt(i);
			if(elementAt instanceof Integer){
//				方式一:
//				Integer score = (Integer)elementAt;
//				int myScore = score.intValue();
//				方式二:自动拆箱
				int myScore = (Integer)elementAt;
				if(myScore >= max - 10){
					grade = 'A';
				}else if(myScore >= max - 20){
					grade = 'B';
				}else if(myScore >= max - 30){
					grade = 'C';
				}else{
					grade = 'D';
				}
				System.out.println("分数:" + myScore + ",等级:" + grade);
			}
		}
		
	}
	
}
