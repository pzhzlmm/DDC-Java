/**  
 * @Title:  Graduate.java   
 * @Package com.atguigu.ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午2:44:43   
 * @version V1.0 
 */ 
package com.atguigu.ex6;

/**   
 * @ClassName:  Graduate   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午2:44:43   
 *     
 */
public class Graduate extends Student{
	public String major="IT";
	public String getInfo()
	{
		return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school+"\nmajor:"+major;
	}
}
