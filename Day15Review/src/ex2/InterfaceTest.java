/**  
 * @Title:  InterfaceTest.java   
 * @Package ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����2:06:57   
 * @version V1.0 
 */ 
package ex2;

/**   
 * @ClassName:  InterfaceTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��4�� ����2:06:57   
 *     
 */
public class InterfaceTest {
	public static void main(String[] args) {
		//��̬���Žӿڵļ��ض�����
		//�Ϳ�ͨ���ӿڵ������ڲ��ľ�̬����
		//�Ǿ�̬�ķ����򲻿��Ե���
		CompareA.method1();
//		SubClass.method1()
//		�����Ե���method1,�ӿ��еľ�ֻ̬���Լ�����,ʵ�����ǲ����Ե��õ�
		SubClass sub = new SubClass();
		sub.method2();
		sub.method3();
		//���ʵ������д��Ĭ���еĽӿڷ���,��ôʵ������õľ�����д����
		
		sub.method4();
		//�ӿڸ�������,�������û��д,��ôĬ�ϵ��õ��Ǹ���ķ���
		//�ӿ���ӿ�֮����ڳ�ͻ,������ͽӿ�֮��������ͬ
		
		System.out.println();
		sub.method();
	}
	
}