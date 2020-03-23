package ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * finally的使�?
 * 
 * 1. finally是可选的
 * 2. 将一定会被执行的代码声明在finally中�?�换句话说，finally中的代码�?定会被执行�??
 *    不管try中是否有仍未被处理的异常，是否try中有return,catch中是否有return，finally中的
 *    代码都一定会被执行！
 * 3. �?发中，哪些代码需要声明在finally中呢？需要说动关闭的资源，比如：流资源�?�socket资源、数据库连接资源等，必须声明在finally中�??
 * 
 * 面试题：区分 finalize、final、finally
 * 
 *  区分�? == �? equals()
 */
public class FinallyTest {
	
	@Test
	public void test1(){
		try{
			int[] arr = new int[10];
			System.out.println(arr[-9]);
		}catch(ClassCastException e){
			e.printStackTrace();
		}finally{
			System.out.println("我一定会被执�?");
		}
		
		System.out.println("我会被执行吗�?");
	}
	
	public int method(){
		try{
			int[] arr = new int[10];
			System.out.println(arr[-9]);
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			return 2;
		}finally{
			System.out.println("我一定会被执行！�?");
			return 3;
		}
	}
	
	@Test
	public void testMethod(){
		int i = method();
		System.out.println(i);
	}
	
	@Test
	public void test2(){
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			int b = fis.read();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null){
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
