package ex3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author XinLan Wang
 * @create 2020-03-18 11:50
 */
public class GenerictTest1 {

    @Test
    public void test1(){
        ArrayList<Object> list1 = null;
        ArrayList<String> list2 = null;

        method(list1);
        method(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("123");
        list3.add("456");
        list3.add("789");
        method1(list3);

    }

    @Test
    public void test2(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("555");
        list1.add(new String());
        String s = new String();
        Object object = new Object();
        System.out.println(s instanceof Object);//true
        System.out.println(s instanceof String);//true
//        list1.add((String) object);
//        java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String

    }

    @Test
    public void test3(){
        ArrayList<Object> list2 = new ArrayList<>();
        Object object = new Object();
        list2.add(object);
        list2.add("555");
        list2.add(123);
        System.out.println(list2);
    }

    public void method(ArrayList<?> list){
//        list.add("123");
//        不让添加数据,通配符中不能够写入数据,但是null是被允许的(唯一被允许加)
//        list.add(123);

    }
    public void method1(ArrayList<?> list){
//        虽然写数据不被允许,但是读数据是被允许的
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}
