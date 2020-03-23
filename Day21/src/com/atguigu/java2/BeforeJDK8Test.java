package com.atguigu.java2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/*
 * jdk8之前的相关日期时间的api的使用
 * 
 * 1. System类的currentTimeMillis()
 * 2. java.util.Date
 * 		|---java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calender日历类
 * 
 * 
 */
public class BeforeJDK8Test {
	
	@Test
	public void test1(){
		//通常用来计算时间差。
		long time = System.currentTimeMillis();
		System.out.println(time);//1584087639264
	}
	
	/*
	 * java.util.Date
	 * 1. 两个构造器：Date() / Date(long millitime)
	 * 2. 两个方法：toString() / getTime()
	 * 
	 * 子类：java.sql.Date
	 * 
	 */
	@Test
	public void test2(){
		//空参的构造器：创建对应当前时间的Date对象
		Date d1 = new Date();
		System.out.println(d1);//Fri Mar 13 16:25:15 GMT+08:00 2020
		
		//getTime():返回此date对象对应的时间戳
		long time = d1.getTime();//1584087969232
		System.out.println(time);
		System.out.println(System.currentTimeMillis());
		
		//创建指定时间戳对应的Date对象
		Date d2 = new Date(15840879232L);
		System.out.println(d2);//Fri Jul 03 16:14:39 GMT+08:00 1970
	}
	
	@Test
	public void test3(){
		java.sql.Date date1 = new java.sql.Date(15840879232L);
		System.out.println(date1);//1970-07-03
		
		System.out.println(date1.getTime());//15840879232
	
	}
	
	//练习：有一个java.util.Date的对象，如何转换为同时间的java.sql.Date类的对象
	@Test
	public void test4(){
//		Date date1 = new Date(23235222423234L);
//		//ClassCastException
//		java.sql.Date date2 = (java.sql.Date) date1;
//		System.out.println(date2);
		
		Date date1 = new Date(23235222423234L);
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
	}
	
	/*
	 * SimpleDateFormat:使用此类实现格式化和解析操作
	 * 
	 * 格式化：日期--->字符串
	 * 解析：字符串--->日期
	 * 
	 * 比如："1995-03-01"转换为对应的日期对象
	 */
	@Test
	public void test5() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date date1 = new Date();
		//格式化过程：
		String strDate = sdf.format(date1);
		System.out.println(strDate);//20-3-13 下午4:45
		
		//解析过程：
		Date date2 = sdf.parse("20-3-13 下午4:45");
		System.out.println(date2);//Fri Mar 13 16:45:00 GMT+08:00 2020
		
		//使用SimpleDateFormat带参的构造器
//		SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM d, ''yy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
		String strDate1 = sdf1.format(date1);
		System.out.println(strDate1);//2020-03-13 16:51:42
		
		Date date3 = sdf1.parse("2020年03月13 20:51:42");
		System.out.println(date3);//Fri Mar 13 20:51:42 GMT+08:00 2020
	}
	/*
	 * 4. Calendar日历类：抽象类
	 * 
	 * 
	 */
	@Test
	public void test6(){
		//返回Calendar子类的一个对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//get()
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		//set()
		calendar.set(Calendar.DAY_OF_MONTH, 23);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//add()
		calendar.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//getTime():获取当前日历对象对应的日期Date对象
		Date date = calendar.getTime();
		System.out.println(date);//Sat Mar 21 17:03:56 GMT+08:00 2020

		
		//setTime(Date d):使用指定的日期Date对象重置Calendar对象
		calendar.setTime(new Date());
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
	}
}
