/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Student.java   
 * @Package com.atguigu.ex.ex1   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午2:55:32   
 * @version V1.0 
 */ 
package com.atguigu.day.ex3;

/**   
 * @ClassName:  Student   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午2:55:32   
 *     
 */
public class Student extends Person{

	long number;
	int math;
	int english;
	int computer;
	/**
	 * @param name
	 * @param sex
	 * @param age
	 */
	public Student(String name, char sex, int age,long number,int math,int english,int computer) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
	}
	double aver(){
		return 0.0;
	}
	int max(){
		return 0;
	}
	int min(){
		return 0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [number=" + number + ", math=" + math + ", english=" + english + ", computer=" + computer + "]";
	}
	
	
	

}
