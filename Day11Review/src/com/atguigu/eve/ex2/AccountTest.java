/**  
 * @Title:  AccountTest.java   
 * @Package com.atguigu.eve.ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午7:29:54   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex2;

/**   
 * @ClassName:  AccountTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午7:29:54   
 *     
 */
public class AccountTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Mary", "Wang");
		Account acct = new Account(1000,2000,0.02);
		cust.setAccount(acct);
		
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		
		System.out.println(cust.toString());;
	}
}
