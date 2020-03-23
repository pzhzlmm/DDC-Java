/**  
 * @Title:  CheckAccountTest.java   
 * @Package com.atguigu.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午8:39:45   
 * @version V1.0 
 */ 
package com.atguigu.ex3;

import com.atguigu.ex2.Account;
import com.atguigu.ex4.CheckAccount;

/**   
 * @ClassName:  CheckAccountTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午8:39:45   
 *     
 */
public class CheckAccountTest {
	public static void main(String[] args) {
//		创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象
		CheckAccount acc = new CheckAccount(1122,20000,0.045,5000);
//		使用withdraw方法提款5000元，并打印账户余额和可透支额。
		acc.withdraw(5000);
//		再使用withdraw方法提款18000元，并打印账户余额和可透支额。
		acc.withdraw(18000);
//		再使用withdraw方法提款3000元，并打印账户余额和可透支额。
		acc.withdraw(3000);
		System.out.println("余额:" +acc.getBalance() + ",月利率:" +acc.getAnnualInterestRate() * 100 + "%");
	}
}
