/**  
 * @Title:  Woman.java   
 * @Package com.atguigu.ex5   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 上午10:58:46   
 * @version V1.0 
 */ 
package com.atguigu.ex5;

/**   
 * @ClassName:  Woman   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 上午10:58:46   
 *     
 */
public class Woman extends Person{
	boolean isBeauty;
	
	public void goShopping(){
		System.out.println("女人购物");
	}
	public void eat(){
		System.out.println("女人吃饭");
	}
	public void walk(){
		System.out.println("女人散步");
	}
}
