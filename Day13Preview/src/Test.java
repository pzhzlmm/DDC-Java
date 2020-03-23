/**  
 * @Title:  Test.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月2日 下午9:13:48   
 * @version V1.0 
 */

/**   
 * @ClassName:  Test   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月2日 下午9:13:48   
 *     
 */
public final class Test {
    public static int totalNumber = 5;
    public final int ID;

    public Test() {
        ID = ++totalNumber; // 可在构造器中给final修饰的“变量”赋值
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.ID);
        final int I = 10;
        final int J;
        J = 20;
//        J = 30; // 非法
    }
}

