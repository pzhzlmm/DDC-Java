/**  
 * @Title:  SingletonTest.java   
 * @Package ex6   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月2日 下午4:34:33   
 * @version V1.0 
 */
package ex6;

/**
 * @ClassName: SingletonTest
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020年3月2日 下午4:34:33
 * 
 */
public class SingletonTest {
	public static void main(String[] args) {

	}

}

class Bank {
	// 不让外面任意造对象
	private Bank() {
	}

	// 内部创建当前类的实例
	private static BankAccount bank = new BankAccount();

	public static BankAccount getInstance() {
		return bank;
	}

}
