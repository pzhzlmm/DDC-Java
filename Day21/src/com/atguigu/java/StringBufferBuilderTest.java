package com.atguigu.java;

import org.junit.Test;

//StringBuffer，StringBuilder的测试
public class StringBufferBuilderTest {

	/*
	 * 一、三个类的对比 
	 * String:不可变的字符序列； 底层使用char[]数组存储 
	 * StringBuffer:可变的字符序列；线程安全的，效率低；底层使用char[]数组存储 
	 * StringBuilder:可变的字符序列； jdk1.5引入，线程不安全的，效率高；底层使用char[]数组存储
	 * 
	 * 注意：在jdk8以后，String\StringBuffer\StringBuilder底层改成byte[]+字符集存储，节省内存空间。
	 * 
	 * 
	 * 1. StringBuffer与StringBuilder的主要区别就是StringBuffer中的方法声明为同步的了。 
	 * 2. String s0 = "";//new char[0]; 
	 * String s1 = "abc";// new char[]{'a','b','c'};
	 * 
	 * s1 += "de";//new char[]{'a','b','c','d','e'};
	 * 
	 * StringBuilder s2 = new StringBuilder();//char arr = new char[16];
	 * StringBuilder s3 = new StringBuilder("abc");//char arr = new char["abc".length() + 16]; 
	 * s2.append("abc");//arr[0] = 'a',arr[1] = 'b',arr[2] = 'c'; 
	 * 
	 * ... 
	 * 有可能底层arr的char[]存储不下了，此时需要扩容！默认扩容为原来容量的2倍+2
	 * 
	 * 启示： 
	 * 1. 开发中如果频繁的对字符串进行修改操作，建议使用StringBuffer/StringBuilder,替换String 
	 * 2.开发中如果不涉及线程安全问题或主动加锁，建议使用StringBuilder，替换StringBuffer 
	 * 3.开发中添加的字符串数据较多，建议使用StringBuilder(int capacity)，替换StringBuilder()
	 */
	@Test
	public void test1() {
		String str1 = "hello";
		str1 += "world";// 新建一个内存空间保存helloworld

		StringBuffer str2 = new StringBuffer("hello");
		str2.append("world");// 与创建对象中的char[]数组是同一个
	}

	/*
	 * 
	 * 二、StringBuffer和StringBuilder中的常用方法
	 * 
	 * StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接 StringBuffer
	 * delete(int start,int end)：删除指定位置的内容 
	 * StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str 
	 * StringBuffer insert(int offset,xxx)：在指定位置插入xxx 
	 * StringBuffer reverse() ：把当前字符序列逆转 
	 * public intindexOf(String str) 
	 * public String substring(int start,int end) 
	 * public int length() 
	 * public char charAt(int n ) 
	 * public void setCharAt(int n ,char ch)
	 * 
	 * 总结： 
	 * 增：append(xxx) 
	 * 删：delete(int start,int end) 
	 * 改：setCharAt(int n ,char ch) / replace(int start, int end, String str) 
	 * 查：charAt(int n ) 
	 * 插：insert(int offset, xxx)
	 * 长度：length() 
	 * 遍历：for + charAt() / toString()
	 * 
	 * 
	 */
	@Test
	public void test2() {
		StringBuffer s1 = new StringBuffer();
		s1.append("abc").append("def").append("123");// 方法链的调用
		System.out.println(s1);

		s1.replace(3, 6, "hello");
		System.out.println(s1);

		s1.insert(3, "123");
		System.out.println(s1);

	}

	/*
	 * 三、对比三者的执行效率
	 *   从高到低：
	 *   StringBuilder > StringBuffer > String
	 */
	@Test
	public void test3() {
		// 初始设置
		long startTime = 0L;
		long endTime = 0L;
		String text = "";
		StringBuffer buffer = new StringBuffer("");
		StringBuilder builder = new StringBuilder("");
		// 开始对比
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			buffer.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			text = text + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String的执行时间：" + (endTime - startTime));

	}
	
}
