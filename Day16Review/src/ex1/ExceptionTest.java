package ex1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 异常的体系结�?
 * 
 * java.lang.Throwable
 * 		|---- java.lang.Error:Java虚拟机无法解决的严重问题�?
 * 				如：JVM系统内部错误、资源�?�尽等严重情况�?�比如：StackOverflowError和OOM。一般不编写针对性的代码进行处理�?

 * 		|---- java.lang.Exception:可以编写针对性的代码进行处理�?
 * 			|----编译时异�?:在执行javac.exe命令时出现的异常
 * 				|----IOException
 * 				|----FileNotFoundException
 * 				|----ClassNotFoundException
 * 			|----运行时异�?(RuntimeException):在执行java.exe命令时出现的异常
 * 				|----NullPointerException
 * 				|----ArithmeticException
 * 				|----InputMismatchException
 * 				|----ArrayIndexOutOfBoundsException
 * 				|----ClassCastException
 * 				|----NumberFormatException
 * 
 * 面试题：你说说你在开发中常见的异常都有哪些？
 */
public class ExceptionTest {
	
	
//	|----NullPointerException

	@Test
	public void test1(){
		String str1 = "atguigu.com";
		str1 = null;
		System.out.println(str1.charAt(0));
	}
//	|----ArithmeticException
	@Test
	public void test2(){
		int i = 10;
		int j = 0;
		System.out.println(i / j);
	}
//	|----InputMismatchException
	@Test
	public void test3(){
		Scanner scann = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = scann.nextInt();
		System.out.println(num);
	}
//	|----ArrayIndexOutOfBoundsException
	@Test
	public void test4(){
		int[] arr = new int[10];
		System.out.println(arr[-9]);
	}
//	|----StringIndexOutOfBoundsException
	@Test
	public void test5(){
		String info = "hello";
		System.out.println(info.charAt(-1));
	}
// 	|----ClassCastException
	@Test
	public void test6(){
		Object obj = new String("hello");
		Date date = (Date)obj;
	}
// 	|----NumberFormatException
	@Test
	public void test7(){
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);
		System.out.println(num);
	}
	
	//****************如下的代码会出现编译时异�?****************************
//	|----IOException
//	|----FileNotFoundException
	@Test
	public void test8(){
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);//FileNotFoundException
//		int b = fis.read();//IOException
//		while(b != -1){
//			System.out.print((char)b);
//			b = fis.read();//IOException
//		}
//		
//		fis.close();//IOException
	}
	
//	|----ClassNotFoundException
	@Test
	public void test9(){
		//Class c = Class.forName("java.lang.String");//ClassNotFoundException
	}
	
}
