import java.util.Random;
import java.util.Vector;

/**  
 * @Title:  StudentTest.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����9:29:11   
 * @version V1.0 
 */

/**   
 * @ClassName:  StudentTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��29�� ����9:29:11   
 *     
 */
public class StudentTest {
	public static void main(String[] args) {
		Vector<Student> v = new Vector<>();

		//���������30��ѧ�� �ɼ���50-100��֮��
		//ͬʱ�ҵ����ֵ
		for (int i = 0; i < 30; i++) { 
			v.addElement(new Student
			(i,(int)(Math.random() * 50 + 50)));
		}
		
		//�ҳ����ֵ
		int max = v.elementAt(0).getScore();
		for (int i = 0; i < 30; i++) {
			if(v.elementAt(i).getScore() > max){
				max = v.elementAt(i).getScore();
			}
		}
		
		System.out.println("���ֵ��:" + max);
		//�����������ӡ�ȼ�
		for (int i = 0; i < 30; i++) {
			System.out.println(v.elementAt(i).toString() +
					((max - v.elementAt(i).getScore()) < 10 ? "A" :"B"));
		}
		
		System.out.println("Vector�ĳ�����:" + v.size());
		
	}
}