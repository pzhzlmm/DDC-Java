/**  
 * @Title:  PersonTest.java   
 * @Package ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����11:48:41   
 * @version V1.0 
 */ 
package ex1;

/**   
 * @ClassName:  PersonTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��4�� ����11:48:41   
 *     
 */
public class AbstractTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Person p1 = new Person(){

			//���������������
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
		System.out.println("��˯��");
	}
}
abstract class Person{
	public abstract void eat();
	public void sleep(){
		System.out.println("��˯��");
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