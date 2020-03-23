/**  
 * @Title:  TemplateMethod.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月2日 下午9:14:43   
 * @version V1.0 
 */

/**   
 * @ClassName:  TemplateMethod   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月2日 下午9:14:43   
 *     
 */
abstract class Template {
    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行时间是：" + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template {
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}

