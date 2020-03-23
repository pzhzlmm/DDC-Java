/**  
 * @Title:  InterfaceTest.java   
 * @Package ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����10:36:31   
 * @version V1.0 
 */
package ex1;

import java.lang.reflect.Method;

/**
 * @ClassName: InterfaceTest
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020��3��4�� ����10:36:31
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		// Flyable.MAX_SPEED = 1000;
		// The final field Flyable.MAX_SPEED cannot be assigned
		Plane p = new Plane();
		p.fly();
		System.out.println(p.MAX_SPEED);

		Bullet bullet = new Bullet();
		
		Flyable f = p;//���ֽӿڵĶ�̬��
		//�ӿڱ������ֶ�̬��
		method(p);
	}
	
	public static void method(Flyable f){
		f.fly();
	}
}

interface Flyable {
	public static final int MIN_SPEED = 1;
	int MAX_SPEED = 7900;

	public abstract void fly();

	void stop();

}

interface Attackable {
	void attack();
}

class Plane implements Flyable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ex1.Flyable#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�ɻ�����");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ex1.Flyable#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�ɻ�ͣ��");
	}

}

abstract class Kite implements Flyable {

}

class Bullet implements Flyable,Attackable{

	/* (non-Javadoc)
	 * @see ex1.Attackable#attack()
	 */
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�ӵ�����,biubiubiu~");
	}

	/* (non-Javadoc)
	 * @see ex1.Flyable#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�ӵ�����,huhuhu~");
	}

	/* (non-Javadoc)
	 * @see ex1.Flyable#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�ӵ�����,������~");
	}
	
}

interface A{
	void test1();
}
interface B{
	void test2();
}
interface C extends A,B{
	
}
class D implements C{

	/* (non-Javadoc)
	 * @see ex1.A#test1()
	 */
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ex1.B#test2()
	 */
	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}