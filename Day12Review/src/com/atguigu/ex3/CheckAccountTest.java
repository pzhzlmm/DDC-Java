/**  
 * @Title:  CheckAccountTest.java   
 * @Package com.atguigu.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����8:39:45   
 * @version V1.0 
 */ 
package com.atguigu.ex3;

import com.atguigu.ex2.Account;
import com.atguigu.ex4.CheckAccount;

/**   
 * @ClassName:  CheckAccountTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����8:39:45   
 *     
 */
public class CheckAccountTest {
	public static void main(String[] args) {
//		����һ���˺�Ϊ1122�����Ϊ20000��������4.5%����͸֧�޶�Ϊ5000Ԫ��CheckAccount����
		CheckAccount acc = new CheckAccount(1122,20000,0.045,5000);
//		ʹ��withdraw�������5000Ԫ������ӡ�˻����Ϳ�͸֧�
		acc.withdraw(5000);
//		��ʹ��withdraw�������18000Ԫ������ӡ�˻����Ϳ�͸֧�
		acc.withdraw(18000);
//		��ʹ��withdraw�������3000Ԫ������ӡ�˻����Ϳ�͸֧�
		acc.withdraw(3000);
		System.out.println("���:" +acc.getBalance() + ",������:" +acc.getAnnualInterestRate() * 100 + "%");
	}
}
