/**  
 * @Title:  BankTest.java   
 * @Package com.atguigu.eve.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午7:46:43   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex3;

/**   
 * @ClassName:  BankTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午7:46:43   
 *     
 */
public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addCustomer("小红", "王");
		bank.addCustomer("小明", "赵");
		bank.addCustomer("小紫", "钱");
		
		bank.getCustomer(0).setAccount(new Account(10000));
		bank.getCustomer(0).getAccount().deposit(2000);
		bank.getCustomer(0).getAccount().withdraw(5000);
		System.out.println("银行中客户的个数为：" + bank.getNumberofCustomers());
		
		for (int i = 0; i < bank.getNumberofCustomers(); i++) {
			Customer cust = bank.getCustomer(i);
			System.out.println("firstname:" + cust.getFirstname() + ",lastname:" + cust.getLastname());
		}
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("账户余额为：" + balance);
	}
}
