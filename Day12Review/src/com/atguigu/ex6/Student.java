/**  
 * @Title:  Student.java   
 * @Package com.atguigu.ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午2:44:37   
 * @version V1.0 
 */ 
package com.atguigu.ex6;

/**   
 * @ClassName:  Student   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午2:44:37   
 *     
 */
public class Student extends Person {
	protected String school="pku";
	public String getInfo() {
  	          return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school;
	}	
}
