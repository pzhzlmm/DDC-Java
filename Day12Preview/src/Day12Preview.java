/**  
 * @Title:  Day12Preview.java   
 * @Package    
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午9:19:14   
 * @version V1.0 
 */

/**   
 * @ClassName:  Day12Preview   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年2月29日 下午9:19:14   
 *     
 */
public class Day12Preview {
	public static void main(String[] args) {
		//字符串到基本数据类型
		int i = new Integer("12");
		Float f = Float.parseFloat("12.1");
		
		//基本数据类型到字符串
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
