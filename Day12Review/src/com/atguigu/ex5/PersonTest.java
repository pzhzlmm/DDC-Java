/**  
 * @Title:  PersonTest.java   
 * @Package com.atguigu.ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 上午11:04:16   
 * @version V1.0 
 */ 
package com.atguigu.ex5;

/**   
 * @ClassName:  PersonTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 上午11:04:16   
 *     
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Man m1 = new Man();
		
		//多态性:父类引用指向子类对象
		Person p2 = new Man();//编译看左，运行看右（只适用于属性，不适应于右边）
		//属性不存在重写，覆盖的说法
		
		p2.eat();//男人吃饭
		p2.walk();//男人散步
		m1.earnMoney();
//		p2.earnMoney();
//		The method earnMoney() is undefined for the type Person
		
//		向下转型:将父类的引用转换为子类的引用类型,只用强转
		Man m2 = (Man)p2;
		m2.earnMoney();
		
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
//		com.atguigu.ex5.Man cannot be cast to com.atguigu.ex5.Woman
//		强转时可能会出现ClassCastException
		System.out.println((p2 instanceof Man));
		if(p2 instanceof Man){
			Man m3 = (Man)p2;
			m3.earnMoney();
		}
		
		if(p2 instanceof Woman){
			Woman w1 = (Woman)p2;
			w1.goShopping();
		}else if(p2 instanceof Man){
			System.out.println("我是女人");
		}
		//
		if(p2 instanceof Person){
			System.out.println("Person");
		}
	}
}
