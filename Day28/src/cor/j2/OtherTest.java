package cor.j2;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 14:47
 * @description: OtherTest 类的主要功能为:
 */
public class OtherTest {
    /**
     * description: test
     * 获取构造器
     * version: 1.0 
     * date: 2020/3/23 14:50 
     * author: XinLan Wang
     * 
     * @param 
     * @return void
     */ 
    @Test
    public void test() throws NoSuchMethodException {
        Class clazz = Person.class;
        Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor c : cons){
            System.out.println(c);
        }
    }


    //所在类的父类
    @Test
    public void test2() throws NoSuchMethodException {
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);

    }


    //所在类的包
    @Test
    public void test3() throws NoSuchMethodException {
        Class clazz = Person.class;
        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    //所在类的注解
    @Test
    public void test4() throws NoSuchMethodException {
        Class clazz = Person.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation anno : annotations){
            System.out.println(anno);
        }
    }

    //所在类实现的接口
    @Test
    public void test5() throws NoSuchMethodException {
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();
        for (Class inner : interfaces){
            System.out.println(inner);
        }
    }

    //所在类代泛型的父类
    @Test
    public void test6() throws NoSuchMethodException {
        Class clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    //所在类代泛型的父类的泛型
    @Test
    public void test7() throws NoSuchMethodException {
        Class clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType pramsType = (ParameterizedType)genericSuperclass;
        Type[] arguments = pramsType.getActualTypeArguments();
        System.out.println((Class)arguments[0]);
    }
}
