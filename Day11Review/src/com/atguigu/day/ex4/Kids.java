/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Kids.java   
 * @Package com.atguigu.ex.ex2   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: XinLan Wang   
 * @date:   2020��2��28�� ����3:08:21   
 * @version V1.0 
 */ 
package com.atguigu.day.ex4;

/**   
 * @ClassName:  Kids   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��2��28�� ����3:08:21   
 * (2)������Kids�̳�ManKind�������� ��Ա����int yearsOld�� 
 * ����printAge()��ӡyearsOld��ֵ�� 
 */
public class Kids extends ManKind{
	int yearsOld;
	public void printAge(){
		System.out.println("����" + yearsOld + "����");
		
	}
	
	void employeed(){
		System.out.println("Kids should study and no job.");
	}
}