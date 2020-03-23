/**  
 * @Title:  USBTest.java   
 * @Package ex1   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年3月4日 上午11:31:18   
 * @version V1.0 
 */ 
package ex1;

/**   
 * @ClassName:  USBTest   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020年3月4日 上午11:31:18   
 *     
 */
public class USBTest {
	public static void main(String[] args) {
		Compurer c1 = new Compurer();
		//1.规规矩矩的写法_非匿名写法
		Flash flash = new Flash();
		c1.transferData(flash);
		Print print = new Print();
		c1.transferData(print);
		
		//2.创建接口实现类的匿名对象
		c1.transferData(new Print());
		
		//3.实现类也可以匿名来写
		//接口匿名实现类的非匿名对象
//		USB usb1 = new Flash();
		USB usb1 = new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("MP3开始工作");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("MP3结束工作");
			}
			
		};
//		usb1.start();
		c1.transferData(usb1);
	
		//4.匿名实现类的匿名对象
		c1.transferData(new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("手机开始工作");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("手机结束工作");
			}
			
		});
	}
}

class Compurer{
	public void transferData(USB usb){
		usb.start();
		System.out.println("usb进行数据传输了");
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
		System.out.println("u盘开始工作");
	}

	/* (non-Javadoc)
	 * @see ex1.USB#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("u盘结束工作");
	}
		
}

class Print implements USB{

	/* (non-Javadoc)
	 * @see ex1.USB#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机开始工作");
	}

	/* (non-Javadoc)
	 * @see ex1.USB#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机结束工作");
	}
		
}