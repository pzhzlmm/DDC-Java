package cor.j3;

import cor.j1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 16:40
 * @description: ReflectionTest 类的主要功能为:
 */
public class ReflectionTest {
    public <T> T getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return (T) constructor.newInstance();
    }
    
    @Test
    public void test1() throws ClassNotFoundException, InvocationTargetException, InstantiationException, NoSuchMethodException, IllegalAccessException {
        String className = "cor.j1.Person";
        Person p1 = getInstance(className);
        System.out.println(p1);
    }

    public Object invoke(String className,String methodName,Object ... objs) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object obj = constructor.newInstance();
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(obj);
    }

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String show = (String) invoke("cor.j1.Person", "show");

    }
}
