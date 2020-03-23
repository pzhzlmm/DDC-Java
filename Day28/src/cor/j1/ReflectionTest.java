package cor.j1;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 9:39
 * @description: ReflectionTest 类的主要功能为:
 */
public class ReflectionTest {

    /**
     * description: test
     * 使用反射之前的例子
     * version: 1.0
     * date: 2020/3/23 9:42
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test(){
        //1.创建类的对象
        Person p1 = new Person();
        System.out.println(p1);
        //2.调用类的属性
        p1.age = 1;
        System.out.println(p1.age);
        //3.调用类的方法
        String info = p1.show();
        System.out.println(info);
    }
    
    /**
     * description: test2使用反射的例子
     * version: 1.0 
     * date: 2020/3/23 9:43 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        //前提:获取运行期中的运行时类:Person
        Class clazz = Person.class;
        //1.创建类的对象
        Person p1 = (Person) clazz.newInstance();
        System.out.println(p1);
        //2.调用类的属性
        Field ageField = clazz.getField("age");
        ageField.set(p1,1);
        System.out.println(p1.age);

        //3.调用类的方法
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);
        String info = (String) showMethod.invoke(p1);
        System.out.println(info);

    }
    
    /**
     * description: test3
     * 原来做不到的
     * version: 1.0 
     * date: 2020/3/23 9:54 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void test3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Person> clazz = Person.class;//私有构造器,私有属性
        //1.调用私有构造器
        Constructor<Person> con = clazz.getDeclaredConstructor(String.class, int.class);
        con.setAccessible(true);
        Person p1 = con.newInstance("Tom", 12);
        System.out.println(p1);

        //2.调用私有属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"Mary");
        System.out.println(p1.name);


        //3.调用私有方法
        //方法名+形参列表
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        showNation.invoke(p1,"CN");
    }

    /**
     * description: test4
     * 如何获取Class的实例
     * version: 1.0
     * date: 2020/3/23 10:46
     * author: XinLan Wang
     *
     * @param
     * @return void
     */
    @Test
    public void test4() throws ClassNotFoundException {
        //方式一:调用类本身的静态属性,class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);//class cor.j1.Person

        //方式二:调用对象的方法,getClass
        Person person = new Person();
        Class clazz2 = person.getClass();
        System.out.println(clazz2);//class cor.j1.Person

        //方式三:调用Class的静态方法:forName(String className)
        //注意这里要写全类名
        Class clazz3 = Class.forName("cor.j1.Person");
        System.out.println(clazz3);

        //指向内存里同一个对象,即同一个运行时类
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);

        //方式四:使用类加载器
        ClassLoader classLoader = ClassLoader.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("cor.j1.Person");
        System.out.println(clazz1 == clazz4);

    }
}
