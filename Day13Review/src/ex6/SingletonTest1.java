/**  
 * @Title:  SingletonTest1.java   
 * @Package ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��2�� ����4:47:18   
 * @version V1.0 
 */
package ex6;

/**
 * @ClassName: SingletonTest1
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020��3��2�� ����4:47:18
 * 
 */
public class SingletonTest1 {
	School s1 = School.getInstance();
}

class School {
	private School() {
	}

	// ����
	private static School school = null;

	public static School getInstance() {
		// school = new School();
		// ÿ����һ��new һ��
		if (school == null) {
			school = new School();
		}
		// ����:һ������new��
		// ����:�ܲ����Ͳ���
		return school;

	}

}