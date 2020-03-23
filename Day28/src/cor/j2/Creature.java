package cor.j2;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-23 14:07
 * @description: Creature 类的主要功能为:
 */
public class Creature<T> {
    private String type;
    public double weight;

    private void info(){
        System.out.println("我是一种生物");
    }

    public void display(){
        System.out.println("type = " + type + " weight = " + weight);
    }
}
