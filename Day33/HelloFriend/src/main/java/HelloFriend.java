/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-30 16:19
 * @description: HelloFriend 类的主要功能为:
 */
public class HelloFriend {
    public String sayHelloToFriend(String name){
        Hello hello = new Hello();
        String str = hello.sayHello(name)+" I am "+this.getMyName();
        return str;
    }
    public String getMyName(){
        return "Idea";
    }
}
