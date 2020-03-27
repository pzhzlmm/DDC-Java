import org.junit.Test;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-26 10:01
 * @description: Lambda 类的主要功能为:
 */
public class Lambda {
    @Test
    public void test(){
        Runnable r2 = () -> System.out.println("ll");//代替匿名实现类
        r2.run();
    }
    
    @Test
    public void test2(){
//        Compiler<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
        
    }
}
