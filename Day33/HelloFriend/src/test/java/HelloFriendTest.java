import org.junit.Test;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-30 16:19
 * @description: HelloFriendTest 类的主要功能为:
 */
public class HelloFriendTest {
    @Test
    public void testHelloFriend(){
        HelloFriend helloFriend = new HelloFriend();
        String results = helloFriend.sayHelloToFriend("Maven");
        System.out.println(results);
    }
}
