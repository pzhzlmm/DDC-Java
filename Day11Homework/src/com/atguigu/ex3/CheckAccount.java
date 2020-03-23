/**  
 * @Title:  CheckAccount.java   
 * @Package com.atguigu.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����8:31:38   
 * @version V1.0 
 */ 
package com.atguigu.ex3;

/**   
 * @ClassName:  CheckAccount   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����8:31:38   
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
			this.setBalance(this.getBalance() - amount);
			System.out.println("�ɹ�ȡ����:" + amount + "\t�����˻����Ϊ:" + this.getBalance());
		}else if(overdraft + this.getBalance() > amount){
			overdraft = overdraft -(amount - this.getBalance());
			this.setBalance(0);
			System.out.println("�ɹ�ȡ����:" + amount + "\t�����˻����Ϊ:" + this.getBalance());
		}else{
			System.out.println("������͸֧����޶�" + (amount - (overdraft + this.getBalance())) + "Ԫ");
			return;
		}
		System.out.println("��͸֧���Ϊ:" + overdraft);
	}
}