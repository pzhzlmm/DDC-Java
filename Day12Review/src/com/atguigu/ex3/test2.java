/**  
 * @Title:  test2.java   
 * @Package com.atguigu.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月28日 下午10:03:58   
 * @version V1.0 
 */ 
package com.atguigu.ex3;

/**   
 * @ClassName:  test2   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月28日 下午10:03:58   
 *     
 */
public class test2 extends Db{
	test2(){
		o = "子类";
		System.out.println(o + o.hashCode());
	}
	public static void main(String[] args) {
		test2 d = new test2();
		System.out.println(d.o + d.o.hashCode());
	}
}
class Db{
	String o;
	Db(){
		o = "父类";
		System.out.println(o + o.hashCode());
	}
}
