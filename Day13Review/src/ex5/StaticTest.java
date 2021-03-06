/**  
 * @Title:  StaticTest.java   
 * @Package ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月2日 下午2:50:25   
 * @version V1.0 
 */ 
package ex5;

/**   
 * @ClassName:  StaticTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月2日 下午2:50:25   
 *     
 */
public class StaticTest {
	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		c1.name = "成龙";
		c1.age = 60;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "周杰伦";
		c2.age = 33;
		c2.nation = "China";
		
		System.out.println(c1);//China
		System.out.println(c2);//China
		
	}
}
	class Chinese{
		String name;
		int age;
		static String nation;
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Chinese [name=" + name + ", age=" + age + ", nation=" + nation + "]";
		}
		
		public static void show(){
			System.out.println("我是一个中国人");
//			eat();静态中不可调用非静态方法
//			Cannot make a static reference to the non-static method eat() from the type Chinese
		}
		public void eat(){
			System.out.println("中国人吃饭");
		}
		public void info(){
			System.out.println("name : " + name + ",age : " + age);
			//非静态可调类中的静态方法
			System.out.println(nation);
		}
		
	}

