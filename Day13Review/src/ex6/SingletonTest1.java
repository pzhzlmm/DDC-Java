/**  
 * @Title:  SingletonTest1.java   
 * @Package ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月2日 下午4:47:18   
 * @version V1.0 
 */
package ex6;

/**
 * @ClassName: SingletonTest1
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020年3月2日 下午4:47:18
 * 
 */
public class SingletonTest1 {
	School s1 = School.getInstance();
}

class School {
	private School() {
	}

	// 声明
	private static School school = null;

	public static School getInstance() {
		// school = new School();
		// 每调用一次new 一次
		if (school == null) {
			school = new School();
		}
		// 饿汉:一上来就new好
		// 懒汉:能不做就不做
		return school;

	}

}
