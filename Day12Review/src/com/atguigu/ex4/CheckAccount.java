/**  
 * @Title:  CheckAccount.java   
 * @Package com.atguigu.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午8:31:38   
 * @version V1.0 
 */ 
package com.atguigu.ex4;

/**   
 * @ClassName:  CheckAccount   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午8:31:38   
 *     
 */
public class CheckAccount extends Account{
	double overdraft;
	
	/**
	 * 
	 */
	public CheckAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param balance
	 * @param annualInterestRate
	 */
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
		this.overdraft = overdraft;
	}

	public void withdraw (double amount){
		if(amount < this.getBalance()){
//			this.setBalance(this.getBalance() - amount);下面这种方法更好
			super.withdraw(amount);
			System.out.println("成功取出了:" + amount + "\t您的账户余额为:" + this.getBalance());
		}else if(overdraft + this.getBalance() >= amount){
			overdraft = overdraft -(amount - this.getBalance());
			this.setBalance(0);
			System.out.println("成功取出了:" + amount + "\t您的账户余额为:" + this.getBalance());
		}else{
			System.out.println("超过可透支额的限额" + (amount - (overdraft + this.getBalance())) + "元");
			return;
		}
		System.out.println("可透支额度为:" + overdraft);
	}
}
