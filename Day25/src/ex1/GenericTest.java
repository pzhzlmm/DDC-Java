package ex1;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XinLan Wang
 * @create 2020-03-18 9:42
 */
public class GenericTest {

    @Test
    public void test1(){
        Order o1 = new Order();
        Object orderT = o1.getOrderT();

        ArrayList<Object> objects = new ArrayList<>();

        SubOrder2<Double> objectSubOrder2 = new SubOrder2<>();
        SubOrder subOrder = new SubOrder();

//        ArrayList<Object> list1 = null;
//        ArrayList<String> list2 = null;
//        list2 = list1;
//       这个list1不能赋给list2我能理解,但list2为什么也不能赋给list1,String不也是一种Object么
//       这两个类型没有任何的关系

        List<String> list1 = null;
        ArrayList<String> list2 = null;
        list1 = list2;


    }
}
