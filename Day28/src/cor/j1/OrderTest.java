package cor.j1;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 11:41
 * @description: OrderTest 类的主要功能为:
 */
public class OrderTest {
    public static void main(String[] args) {
        System.out.println(Order.num);
    }
}
class Order{
    static int num = 10;
    static {
        num = 20;
    }
}
