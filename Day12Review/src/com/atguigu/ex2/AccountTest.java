/**  
 * @Title:  AccountTest.java   
 * @Package com.atguigu.ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����8:27:06   
 * @version V1.0 
 */ 
package com.atguigu.ex2;

/**   
 * @ClassName:  AccountTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����8:27:06   
 *     
 */
public class AccountTest {
	public static void main(String[] args) {
	/*	дһ���û��������Account�ࡣ���û������У�
	 * ����һ���˺�Ϊ1122�����Ϊ20000��������4.5%��Account����
	 * ʹ��withdraw�������30000Ԫ������ӡ��
	        ��ʹ��withdraw�������2500Ԫ��
	        ʹ��deposit�������3000Ԫ��Ȼ���ӡ���������ʡ�
	*/
		Account acc = new Account(1122,20000,0.045);
		acc.withdraw(30000);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("���:" +acc.getBalance() + ",������:" +acc.getAnnualInterestRate());
	}
}