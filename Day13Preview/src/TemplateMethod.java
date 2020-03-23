/**  
 * @Title:  TemplateMethod.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��2�� ����9:14:43   
 * @version V1.0 
 */

/**   
 * @ClassName:  TemplateMethod   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��2�� ����9:14:43   
 *     
 */
abstract class Template {
    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("ִ��ʱ���ǣ�" + (end - start));
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

