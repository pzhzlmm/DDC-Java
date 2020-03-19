package ex5$;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XinLan Wang
 * @create 2020-03-18 15:25
 */
public class GenericTest {
    public void test1(){
        List<Object> list1 = null;
        List<Person> list2 = null;
        List<Student> list3 = null;
        List<?> list4 = null;//只能写入null,别的不可以
        list4 = list1;
        list4 = list2;
        list4 = list3;

        //?只能接受Person以及Person子类的泛型
        List<? extends Person> list5 = null;//extends 类似于小于等于
//        list5 = list1;
        list5 = list2;
        list5 = list3;

        //?只能接受Person以及Person父类的泛型
        List<? super Person> list6 = null;//super类似于大于等于
        list6 = list1;
        list6 = list2;
//        list6 = list3;
    }

    public void test2(){
        List<? extends Person> list5 = null;
        list5.add(null);

//        list5.add(new Student());
        Person person = list5.get(0);//可以读取,读取的类型为Person

        List<Student> list = new ArrayList<>();
        list5 = list;
    }

    @Test
    public void test3(){
        //写入数据可以写入Person和Person的子类
        List<? super Person> list5 = null;
        list5.add(null);
        list5.add(new Student());
        list5.add(new Person());

        //读取数据只能为Object类型
        Object object = list5.get(0);

        List<Object> list = new ArrayList<>();
        list.add(new Object());


    }
}



