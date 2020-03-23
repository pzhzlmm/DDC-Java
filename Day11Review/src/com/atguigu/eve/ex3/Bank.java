/**  
 * @Title:  Bank.java   
 * @Package com.atguigu.eve.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午7:39:05   
 * @version V1.0 
 */ 
package com.atguigu.eve.ex3;

/**   
 * @ClassName:  Bank   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午7:39:05   
 *     
 */
public class Bank {
	private Customer[] customers;
	private int numberofCustomers;
	
	/**
	 * 
	 */
	public Bank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(String f, String l){
		Customer cust = new Customer(f,l);
		if(numberofCustomers < customers.length){
			customers[numberofCustomers++]=cust;
		}
	}

	/**
	 * @return the numberofCustomers
	 */
	public int getNumberofCustomers() {
		return numberofCustomers;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= numberofCustomers){
			System.out.println("输入位置非法");
			return null;
		}else{
			return customers[index];
		}
	}

}
