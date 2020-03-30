import org.junit.Test;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-30 16:17
 * @description: HelloTest 类的主要功能为:
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
