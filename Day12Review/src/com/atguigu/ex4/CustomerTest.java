/**  
 * @Title:  CustomerTest.java   
 * @Package com.atguigu.ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 上午10:47:31   
 * @version V1.0 
 */ 
package com.atguigu.ex4;

/**   
 * @ClassName:  CustomerTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 上午10:47:31   
 *     
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust =new Customer("xinlan","wang");
		Account acc = new Account(10000,100,0.035);
		Account acct1 = new CheckAccount(1002,2000,1000,1000);
		cust.setAcc(acct1);
		cust.toString();
		cust.getAcc().withdraw(2500);
	}
}
