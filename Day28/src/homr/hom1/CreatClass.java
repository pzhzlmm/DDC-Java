package homr.hom1;


import org.junit.Test;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 20:28
 * @description: CreatClass 类的主要功能为:
 * 创建Class对应运行时类的对象的通用方法，代码实现。以及这样操作，需要对应的运行时类构造器方面满足的要求。
 */
public class CreatClass {
    @Test
    public void test() throws ClassNotFoundException {
        //方式一,通过类的静态属性
        Class<Person1> clazz = Person1.class;
        System.out.println(clazz);

        //方式二:通过调用已有对象的方法
        Person1 person1 = new Person1(12,"tom");
        Class<? extends Person1> clazz2 = person1.getClass();
        System.out.println(clazz2);

        //方式三:使用Class类的静态方法
        Class<?> clazz3 = Class.forName("homr.hom1.Person1");
        System.out.println(clazz3);

        //方式四:使用类的加载器
        ClassLoader classLoader = CreatClass.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("homr.hom1.Person1");
        System.out.println(clazz4);

    }
}
