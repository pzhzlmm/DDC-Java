/**  
 * @Title:  SingletonTest.java   
 * @Package ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��2�� ����4:34:33   
 * @version V1.0 
 */
package ex6;

/**
 * @ClassName: SingletonTest
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020��3��2�� ����4:34:33
 * 
 */
public class SingletonTest {
	public static void main(String[] args) {

	}

}

class Bank {
	// �����������������
	private Bank() {
	}

	// �ڲ�������ǰ���ʵ��
	private static BankAccount bank = new BankAccount();

	public static BankAccount getInstance() {
		return bank;
	}

}