/**  
 * @Title:  MyDate.java   
 * @Package com.atguigu.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:15:02   
 * @version V1.0 
 */ 
package com.atguigu.ex3;

/**   
 * @ClassName:  MyDate   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午9:15:02   
 *     
 */
public class MyDate {
	int year;
	int month;
	int day;
	/**
	 * 
	 */
	public MyDate() {
		super();
	}
	/**
	 * @param year
	 * @param month
	 * @param day
	 */
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
}
