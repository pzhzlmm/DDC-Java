/**  
 * @Title:  AccountTest.java   
 * @Package com.atguigu.ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午8:27:06   
 * @version V1.0 
 */ 
package com.atguigu.ex2;

/**   
 * @ClassName:  AccountTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午8:27:06   
 *     
 */
public class AccountTest {
	public static void main(String[] args) {
	/*	写一个用户程序测试Account类。在用户程序中，
	 * 创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
	 * 使用withdraw方法提款30000元，并打印余额。
	        再使用withdraw方法提款2500元，
	        使用deposit方法存款3000元，然后打印余额和月利率。
	*/
		Account acc = new Account(1122,20000,0.045);
		acc.withdraw(30000);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("余额:" +acc.getBalance() + ",月利率:" +acc.getAnnualInterestRate());
	}
}
