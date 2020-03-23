package com.atguigu.java;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.junit.Test;

//测试String与其他结构之间的转换
public class StringTest {

	
	/*
	 * String与包装类、基本数据类型之间的转化
	 */
	@Test
	public void test1(){
		//String-->包装类、基本数据类型:调用包装类Xxx的parseXxx()
		String str = "123";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
//		包装类、基本数据类型--> String:调用String的valueOf()
		String str1 = String.valueOf(num);
		System.out.println(str1);
		
		String str2 = num + "";//底层需要创建SringBuilder,并调用append()导致效率第一valueOf()
		System.out.println(str2);
	}
	
	/*
	 * String与char[]之间的转化
	 */
	@Test
	public void test2(){
		String str1 = "hello";
		//String--->char[]:调动String的toCharArray()
		char[] arr1 = str1.toCharArray();
		for(int i = 0;i < arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
		//char[] ---> String:调用String的构造器
		String str2 = new String(arr1, 0, arr1.length);//new String(arr1);
		System.out.println(str2);
	}
	
	/*
	 * String与byte[]之间的转化
	 * 
	 * 
	 * 1. 关联：
	 * 内存层面：
	 * char:用2个字节存储
	 * 
	 * 存储层面：
	 * 一个char，应该用几个字节存储呢？跟字符集有关系，具体问题具体分析
	 * 
	 * ASCII:给26个英文大小写字母，0-9等都分配了对应的一个字节数值。比如：a --> 97   A--> 65
	 * GBK:兼容了ASCII(如果出现英文字母，0-9时，仍然使用1个字节存储），一个汉字使用2个字节存储
	 * UTF-8:兼容了ASCII(如果出现英文字母，0-9时，仍然使用1个字节存储），一个汉字使用3个字节存储
	 * 
	 * 2. 
	 * 编码： 字符、字符串--->字节、字节数组
	 * 	> 从看得懂的，转换为看不懂的。
	 * 
	 * 解码：字节、字节数组 --> 字符、字符串
	 *  > 从看不懂的，转换为看得懂的。
	 *  
	 * 结论：编码集要与解码集一致。否则会出现乱码！
	 */
	@Test
	public void test3() throws Exception{
		String str1 = "hello中国";
		//编码：String--->byte[]：getBytes()
		byte[] arr1 = str1.getBytes();//使用默认的字符集：UTF-8
		System.out.println(Arrays.toString(arr1));
		
		byte[] arr2 = str1.getBytes("gbk");//显式指定字符集。
		System.out.println(Arrays.toString(arr2));
		
		//解码：byte[] ---> String:使用构造器
		
		String str2 = new String(arr1);//使用默认的字符集：UTF-8
		System.out.println(str2);
		
		String str3 = new String(arr2);
		System.out.println(str3);//因为编码集和现在的解码集不一致，导致出现乱码！
		
		String str4 = new String(arr2,"gbk");
		System.out.println(str4);//因为编码集和现在的解码集都是使用gbk，没有乱码
	}
	
}
