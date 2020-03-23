/**  
 * @Title:  Account.java   
 * @Package com.atguigu.eve.ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����7:18:17   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex2;

import java.awt.image.BandCombineOp;

/**   
 * @ClassName:  Account   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����7:18:17   
 *     
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(){};
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
	 * @Title: withdraw   
	 * @Description: TODO   ȡǮ����
	 * @param:       
	 * @return: void      
	 * @throws   
	 */
	public void withdraw(double amount) {
		if(balance >= amount){
			balance -= amount;
			System.out.println("�ɹ����룺" + amount);
		}else{
			System.out.println("���㣬ȡ��ʧ�ܣ�");
		}
	}
	
	public void deposit(double amount){
		if(amount > 0){
			balance += amount;
			System.out.println("�ɹ����룺" + amount);			
		}else{
			System.out.println("�������ݷǷ�������Ϊ0");
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate * 100 + "%]";
	}
	
	
	
}