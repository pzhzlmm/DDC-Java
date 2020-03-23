/**  
 * @Title:  AnimalTest.java   
 * @Package com.atguigu.ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 上午11:41:08   
 * @version V1.0 
 */ 
package com.atguigu.ex5;

import java.net.ConnectException;
import java.sql.Connection;

/**   
 * @ClassName:  AnimalTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 上午11:41:08   
 *     
 */
public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Animal());
		test.func(new Dog());
		test.func(new Cat());
	}
	public void func(Animal animal){
		animal.eat();
		animal.shout();
		
		if(animal instanceof Dog){
			Dog dog = (Dog)animal;
			dog.protectHome();
		}else if(animal instanceof Cat){
			Cat cat = (Cat)animal;
			cat.catchMonse();
		}
	}
}
class Animal{
	public void eat(){
		System.out.println("动物进食");
	}
	public void shout(){
		System.out.println("动物叫");
	}
	
}
class Dog extends Animal{
	public void eat(){
		System.out.println("狗吃骨头");
	}
	public void shout(){
		System.out.println("汪~汪~汪");
	}
	public void protectHome(){
		System.out.println("狗看门");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃小鱼");
	}
	public void shout(){
		System.out.println("喵喵喵~");
	}
	public void catchMonse(){
		System.out.println("猫爪耗子");
	}
}
class Order{
	public boolean equals(Object obj){
		return false;
	}
}

class DataBaseTest{
	public void insertData(Connection conn){
		
	}
}
