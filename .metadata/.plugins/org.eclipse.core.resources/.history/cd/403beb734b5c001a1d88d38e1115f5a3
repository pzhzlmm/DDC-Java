import java.util.Random;
import java.util.Vector;

/**  
 * @Title:  StudentTest.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:29:11   
 * @version V1.0 
 */

/**   
 * @ClassName:  StudentTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午9:29:11   
 *     
 */
public class StudentTest {
	public static void main(String[] args) {
		Vector<Student> v = new Vector<>();

		//先随机生成30个学生 成绩在50-100分之间
		//同时找到最大值
		for (int i = 0; i < 30; i++) { 
			v.addElement(new Student
			(i,(int)(Math.random() * 50 + 50)));
		}
		
		//找出最大值
		int max = v.elementAt(0).getScore();
		for (int i = 0; i < 30; i++) {
			if(v.elementAt(i).getScore() > max){
				max = v.elementAt(i).getScore();
			}
		}
		
		System.out.println("最大值是:" + max);
		//遍历输出并打印等级
		for (int i = 0; i < 30; i++) {
			System.out.println(v.elementAt(i).toString() +
					((max - v.elementAt(i).getScore()) < 10 ? "A" :"B"));
		}
		
		System.out.println("Vector的长度是:" + v.size());
		
	}
}
