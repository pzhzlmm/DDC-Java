/**  
 * @Title:  PersonTest.java   
 * @Package ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 上午11:48:41   
 * @version V1.0 
 */ 
package ex1;

/**   
 * @ClassName:  PersonTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 上午11:48:41   
 *     
 */
public class AbstractTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Person p1 = new Person(){

			//抽象类的匿名子类
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Person2 p2 = new Person2(){};
	}
}
abstract class Person2{
	public void sleep(){
		System.out.println("人睡觉");
	}
}
abstract class Person{
	public abstract void eat();
	public void sleep(){
		System.out.println("人睡觉");
	}
}

class Student extends Person{

	/* (non-Javadoc)
	 * @see ex1.Person#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}
