package homr.hom3;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 20:56
 * @description: UserTest 类的主要功能为:
 */
public class UserTest {
    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //1.获取类
        Class<User> userClass = User.class;

        //2.通过类获取方法名
        Method declaredMethod = userClass.getDeclaredMethod("show");
        //3.设置此方法是可以访问的
        declaredMethod.setAccessible(true);
        //4.调用方法
        //4.1 创建对象
        User user = userClass.newInstance();
        //4.2 正式调用
        declaredMethod.invoke(user);
    }
}
