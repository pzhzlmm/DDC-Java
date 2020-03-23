/**  
 * @Title:  InstanceTest.java   
 * @Package com.atguigu.ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午2:45:46   
 * @version V1.0 
 */
package com.atguigu.ex6;

/**
 * @ClassName: InstanceTest
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020年2月29日 下午2:45:46
 * 
 */
public class InstanceTest {
	public static void main(String[] args) {
		Person e = new Graduate();
		InstanceTest test = new InstanceTest();
		test.method(e);
	}

	public void method(Person e) {
		System.out.println(e.toString());
		if (e instanceof Graduate) {
			System.out.println("a Graduate");
		}
		if (e instanceof Student) {
			System.out.println("a Student");
		}
		if (e instanceof Person) {
			System.out.println("a Person");
		}
	}
}
