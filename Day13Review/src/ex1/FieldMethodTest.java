/**  
 * @Title:  FieldMethodTest.java   
 * @Package ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月2日 上午9:22:21   
 * @version V1.0 
 */ 
package ex1;

/**   
 * @ClassName:  FieldMethodTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月2日 上午9:22:21   
 *     
 */
class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}
class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
public class FieldMethodTest {
    public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b == s);//true
        System.out.println(b.count);//10
        b.display();//20
    }
}

