/**  
 * @Title:  Day12Preview.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����9:19:14   
 * @version V1.0 
 */

/**   
 * @ClassName:  Day12Preview   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��29�� ����9:19:14   
 *     
 */
public class Day12Preview {
	public static void main(String[] args) {
		//�ַ�����������������
		int i = new Integer("12");
		Float f = Float.parseFloat("12.1");
		
		//�����������͵��ַ���
		String fstr = String.valueOf(2.34f);
		System.out.println(fstr);
		
		i = 500;
		Integer t = new Integer(i);
		String s = t.toString();
		String s1 = Integer.toString(314);
		String s2 = "4.56";
		double ds = Double.parseDouble(s2);
		
		int j = t.intValue();
		String str1 = "30";
		String str2 = "30.3";
		int x = Integer.parseInt(str1);
		 f = Float.parseFloat(str2);
		
		
	}
}