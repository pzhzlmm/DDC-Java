/**  
 * @Title:  EqualsTest.java   
 * @Package com.atguigu.ex3   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:15:33   
 * @version V1.0 
 */ 
package com.atguigu.ex3;

/**   
 * @ClassName:  EqualsTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午9:15:33   
 *     
 */
public class EqualsTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
