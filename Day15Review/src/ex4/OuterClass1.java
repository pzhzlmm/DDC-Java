/**  
 * @Title:  OuterClass1.java   
 * @Package ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����4:19:42   
 * @version V1.0 
 */ 
package ex4;

/**   
 * @ClassName:  OuterClass1   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��4�� ����4:19:42   
 *     
 */
public class OuterClass1 {
	public void method(){
		//�����бȽ��ټ�
		class A{
			
		}
	}
	
	//���ؽӿ�ʵ����Ķ���
	public Comparable getComparable(){
//		class MyComparable implements Comparable{
//
//			/* (non-Javadoc)
//			 * @see java.lang.Comparable#compareTo(java.lang.Object)
//			 */
//			@Override
//			public int compareTo(Object o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			return snew MyComparable;
//	}
		//����ʵ�������������
		return new Comparable(){

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}//��׿�д���ʹ��
		};
	}
}