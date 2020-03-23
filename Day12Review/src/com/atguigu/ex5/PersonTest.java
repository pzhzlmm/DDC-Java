/**  
 * @Title:  PersonTest.java   
 * @Package com.atguigu.ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����11:04:16   
 * @version V1.0 
 */ 
package com.atguigu.ex5;

/**   
 * @ClassName:  PersonTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��29�� ����11:04:16   
 *     
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Man m1 = new Man();
		
		//��̬��:��������ָ���������
		Person p2 = new Man();//���뿴�����п��ң�ֻ���������ԣ�����Ӧ���ұߣ�
		//���Բ�������д�����ǵ�˵��
		
		p2.eat();//���˳Է�
		p2.walk();//����ɢ��
		m1.earnMoney();
//		p2.earnMoney();
//		The method earnMoney() is undefined for the type Person
		
//		����ת��:�����������ת��Ϊ�������������,ֻ��ǿת
		Man m2 = (Man)p2;
		m2.earnMoney();
		
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
//		com.atguigu.ex5.Man cannot be cast to com.atguigu.ex5.Woman
//		ǿתʱ���ܻ����ClassCastException
		System.out.println((p2 instanceof Man));
		if(p2 instanceof Man){
			Man m3 = (Man)p2;
			m3.earnMoney();
		}
		
		if(p2 instanceof Woman){
			Woman w1 = (Woman)p2;
			w1.goShopping();
		}else if(p2 instanceof Man){
			System.out.println("����Ů��");
		}
		//
		if(p2 instanceof Person){
			System.out.println("Person");
		}
	}
}