/**  
 * @Title:  Account.java   
 * @Package com.atguigu.ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����8:20:34   
 * @version V1.0 
 */ 
package com.atguigu.ex3;

/**   
 * @ClassName:  Account   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����8:20:34   
 *     
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	/**
	 * 
	 */
	public Account() {
		super();
	}
	/**
	 * @param id
	 * @param balance
	 * @param annualInterestRate
	 */
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public void withdraw (double amount){
		if(amount < balance){
			balance -= amount;
			System.out.println("�ɹ�ȡ����:" + amount + "�����˻����Ϊ:" + balance);
		}else{
			System.out.println("����!");
		}
	}
	public void deposit (double amount){
		if(amount > 0){
			balance += amount;
			System.out.println("�ɹ�������:" + amount + "�����˻����Ϊ:" + balance);
		}else{
			System.out.println("����Ƿ�,����������");
		}
	}
}