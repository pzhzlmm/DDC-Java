/**  
 * @Title:  SubClass.java   
 * @Package ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����2:08:34   
 * @version V1.0 
 */ 
package ex2;

/**   
 * @ClassName:  SubClass   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��4�� ����2:08:34   
 *     
 */
public class SubClass extends SuperClass implements CompareA,CompareB{
	
	//defaultҪɾ��,���ﱻ��Ϊ����д�˽ӿ��е�method2����
	public  void method2(){
		System.out.println("�Ͼ�");
	}

	/* (non-Javadoc)
	 * @see ex2.CompareB#method3()
	 */
	@Override
	public void method3() {
		// TODO Auto-generated method stub
//		System.out.println("����);;
	}
	
	//Duplicate default methods named method3 with the parameters () and () are inherited from the types CompareB and CompareA
	//������������������д
	
	public void method4() {
		System.out.println("����");
	}
	
	public void method(){
		method4();
		super.method4();
		CompareA.super.method3();
		CompareB.super.method3();
		//�ñ�Ľӿ��еķ���
	}
	
}
