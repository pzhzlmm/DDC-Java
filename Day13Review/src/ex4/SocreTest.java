/**  
 * @Title:  SocreTest.java   
 * @Package ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��2�� ����2:18:45   
 * @version V1.0 
 */ 
package ex4;

import java.util.Scanner;
import java.util.Vector;

/**   
 * @ClassName:  SocreTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��2�� ����2:18:45   
 *     
 */
public class SocreTest {
	public static void main(String[] args) {
		//ʵ����Vector
		Vector v = new Vector();
		//ʵ����Scanner
		Scanner sc = new Scanner(System.in);
		int max = 0;
		for (;;) {
			int number = sc.nextInt();
			
			//���������Ǹ���,������ѭ������
			if(number < 0){
				break;
			}
			
			v.addElement(number);//�ڲ��漰һ���Զ�װ��
			if(max < number){
				max = number;
			}
			
		}
		char grade = '0';
		for (int i = 0; i < v.size(); i++) {
			Object elementAt = v.elementAt(i);
			if(elementAt instanceof Integer){
//				��ʽһ:
//				Integer score = (Integer)elementAt;
//				int myScore = score.intValue();
//				��ʽ��:�Զ�����
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
				System.out.println("����:" + myScore + ",�ȼ�:" + grade);
			}
		}
		
	}
	
}
