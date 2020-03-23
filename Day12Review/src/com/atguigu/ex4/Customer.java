/**  
 * @Title:  Customer.java   
 * @Package com.atguigu.ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 上午10:45:19   
 * @version V1.0 
 */ 
package com.atguigu.ex4;

/**   
 * @ClassName:  Customer   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 上午10:45:19   
 *     
 */
public class Customer {
	private String firstname;
	private String lastname;
	private Account acc;
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the acc
	 */
	public Account getAcc() {
		return acc;
	}
	/**
	 * @param acc the acc to set
	 */
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	/**
	 * @param firstname
	 * @param lastname
	 */
	public Customer(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	
	
}
