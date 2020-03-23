/**  
 * @Title:  AnimalTest.java   
 * @Package com.atguigu.ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����11:41:08   
 * @version V1.0 
 */ 
package com.atguigu.ex5;

import java.net.ConnectException;
import java.sql.Connection;

/**   
 * @ClassName:  AnimalTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��29�� ����11:41:08   
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
		System.out.println("�����ʳ");
	}
	public void shout(){
		System.out.println("�����");
	}
	
}
class Dog extends Animal{
	public void eat(){
		System.out.println("���Թ�ͷ");
	}
	public void shout(){
		System.out.println("��~��~��");
	}
	public void protectHome(){
		System.out.println("������");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("è��С��");
	}
	public void shout(){
		System.out.println("������~");
	}
	public void catchMonse(){
		System.out.println("èצ����");
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