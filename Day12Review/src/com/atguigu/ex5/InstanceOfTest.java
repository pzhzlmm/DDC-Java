/**  
 * @Title:  InstanceOfTest.java   
 * @Package com.atguigu.ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����2:22:18   
 * @version V1.0 
 */ 
package com.atguigu.ex5;

import java.util.Date;

/**   
 * @ClassName:  InstanceOfTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��29�� ����2:22:18   
 *     
 */
public class InstanceOfTest {
	public static void main(String[] args) {
//		����ͨ��,���в��������
		Person p1 = new Woman();
//		Man man = (Man)p1;
//		java.lang.ClassCastException
		
//		Person p2 = new Person();
//		Man man2 = (Man)p2;
//		ClassCastException
		
		//�ܹ�
		Woman woman1 = (Woman)p1;
		
		Object obj = new Man();
		Person p = (Person)obj;
		
//		//���벻ͨ��
//		Man m1 = new Man();
//		Woman w = (Woman)m1;
//		��Ůû�̳й�ϵ
		
		String str = "hello";
//		Date date = (Date)str;
//		û���Ӹ����ϵ,����ת����
		
//		Object obj1 = str;
//		Date date1 = (Date)obj1;
//		�����ܹ�,���й�����,��Ϊ������û��ϵ
//		java.lang.String cannot be cast to java.util.Date
		
		
	}
}