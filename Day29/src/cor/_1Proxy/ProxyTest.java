package cor._1Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-24 9:52
 * @description: ProxyTest 类的主要功能为:
 * 动态代理
 *
 */
interface Human{

    String getBelief();
    void eat(String food);

}

class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

//动态创建代理类对象
class Myproxy{

    //返回一个代理类的对象

    public static Object getProxyInstance(Object targetObj){//targetObj 被代理类的对象
        MyInvocationHandler handler = new MyInvocationHandler(targetObj);

        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),targetObj.getClass().getInterfaces(), handler);
        //1.被代理类对象的类加载器
        //2.实现哪些接口(代理被代理实现相同接口)
        //3.InvocationHandler的实例
    }

}

//调用代理类接口的方法时,转为被代理类的
class MyInvocationHandler implements InvocationHandler{

    private Object targetObj;
    public MyInvocationHandler(Object targetObj){
        this.targetObj = targetObj;
    }

    //调用代理类对象,会自动调用如下方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(targetObj,args);
        //返回值即为被代理类同名方法的返回值
    }
}

public class ProxyTest {

    //创建被代理类对象
    public static void main(String[] args) {
        SuperMan man = new SuperMan();

        //动态创建代理类对象
        Human proxyInstance = (Human) Myproxy.getProxyInstance(man);
        //通过代理类的对象调用接口中的同名方法,就会调用被代理类的同名方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);

        proxyInstance.eat("四川麻辣烫");


//        例子2
        NikeFactory nike = new NikeFactory();
        ClothFactory factory = (ClothFactory) Myproxy.getProxyInstance(nike);
        factory.produceCloth();
    }

}
