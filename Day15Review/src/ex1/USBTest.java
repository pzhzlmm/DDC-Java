/**  
 * @Title:  USBTest.java   
 * @Package ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����11:31:18   
 * @version V1.0 
 */ 
package ex1;

/**   
 * @ClassName:  USBTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��4�� ����11:31:18   
 *     
 */
public class USBTest {
	public static void main(String[] args) {
		Compurer c1 = new Compurer();
		//1.���ؾص�д��_������д��
		Flash flash = new Flash();
		c1.transferData(flash);
		Print print = new Print();
		c1.transferData(print);
		
		//2.�����ӿ�ʵ�������������
		c1.transferData(new Print());
		
		//3.ʵ����Ҳ����������д
		//�ӿ�����ʵ����ķ���������
//		USB usb1 = new Flash();
		USB usb1 = new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("MP3��ʼ����");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("MP3��������");
			}
			
		};
//		usb1.start();
		c1.transferData(usb1);
	
		//4.����ʵ�������������
		c1.transferData(new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("�ֻ���ʼ����");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("�ֻ���������");
			}
			
		});
	}
}

class Compurer{
	public void transferData(USB usb){
		usb.start();
		System.out.println("usb�������ݴ�����");
		usb.stop();

	}
}

interface USB{
	
	public abstract void start();
	void stop();
}

class Flash implements USB{

	/* (non-Javadoc)
	 * @see ex1.USB#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("u�̿�ʼ����");
	}

	/* (non-Javadoc)
	 * @see ex1.USB#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("u�̽�������");
	}
		
}

class Print implements USB{

	/* (non-Javadoc)
	 * @see ex1.USB#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ����ʼ����");
	}

	/* (non-Javadoc)
	 * @see ex1.USB#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ����������");
	}
		
}