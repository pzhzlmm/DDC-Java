package cor.j2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.TreeMap;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 15:48
 * @description: ReflectionTest 类的主要功能为:
 */
public class ReflectionTest {
    /**
     * description: test1
     *         //使用反射设置属性步骤
     *         //1.getDeclaredField 获取指定名的属性
     *         //2.setAccessible 保证此属性是可访问的
     *         //3.set/get
     * version: 1.0
     * date: 2020/3/23 15:57
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test1() throws IllegalAccessException, InstantiationException, NoSuchFieldException {

//        public int age;
        Class<Person> clazz = Person.class;

        Person p1 = clazz.newInstance();
        Field ageField = clazz.getField("age");
        ageField.set(p1,10);
        int age = (int) ageField.get(p1);
        System.out.println(age);

        //  private String name;
        Field nameField = clazz.getDeclaredField("name");
//        nameField.set(p1,"tom");
//        IllegalAccessException: Class cor.j2.ReflectionTest can not access a member of class cor.j2.Person with modifiers "private"
        nameField.setAccessible(true);
        nameField.set(p1,"tom");
        String name = (String) nameField.get(p1);
        System.out.println(name);

        //调用静态的属性
//        private static String info = "我是一个人";
        Field infoField = clazz.getDeclaredField("info");
        infoField.setAccessible(true);
//        String info = (String) infoField.get(Person.class);
        String info = (String) infoField.get(null);
        System.out.println(info);
        infoField.set(null,"hahaha");
        info = (String) infoField.get(null);
        System.out.println(info);

    }

    /**
     * description: test2
     * 使用反射去调用非静态方法的常规步骤
     * version: 1.0
     * date: 2020/3/23 16:19
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //造对象
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
//        通用调用方法步骤
        //1.获取指定的方法,后面要把形参类型给放上去,注意这里没有自动装箱拆箱了
        Method showNation1Method = clazz.getDeclaredMethod("showNation1", String.class,int.class);
        //2.设置可访问
        showNation1Method.setAccessible(true);
        //3.调用此方法
//        System.out.println(showNation1Method.invoke(p1,"CHN",10));
        String chn = (String) showNation1Method.invoke(p1, "CHN", 10);
        System.out.println(chn);
        //invoke方法的返回值即为对应的方法的返回值,没返回值即为null

        //调用静态方法
//        public static void showInfo()
        Method showInfo = clazz.getDeclaredMethod("showInfo");
        showInfo.setAccessible(true);
        Object returnVal = showInfo.invoke(null);//静态非静态区别主要在于调用者,静态调用者可以是null
        System.out.println(returnVal);
    }

    /**
     * description:
     * 调用构造器
     * 如果没有调用空参构造器,或者调用了权限又不够
     * version: 1.0
     * date: 2020/3/23 16:30
     * author: XinLan Wang
     *
     * @param null
     * @return
     */
    @Test
    public void test3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        public Person(String name, int age)
        Class clazz = Person.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
//        declaredConstructor.setAccessible(true);
        Person p = (Person) declaredConstructor.newInstance("mary", 13);
        System.out.println(p);
    }
}
