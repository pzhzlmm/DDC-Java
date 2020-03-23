/**  
 * @Title:  JunitTst.java   
 * @Package ex2   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��2�� ����10:38:54   
 * @version V1.0 
 */
package ex2;

import org.junit.Test;

/**
 * @ClassName: JunitTst
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020��3��2�� ����10:38:54
 * 
 */
public class JunitTst {
	@Test
	public void test1() {
		System.out.println("gekk");
	}

	@Test
	public void test2() {
		System.out.println("gekk");
	}

	@Test
	public void test3() {
		int i = 10;
		Integer i2 = new Integer(i);
		System.out.println(i2);

		Integer i3 = new Integer(5);
		System.out.println(i3);

		float f3 = 3.14f;
		Float f4 = new Float(f3);
		System.out.println(f4);

		System.out.println(new Float(5.0));

		Boolean b = new Boolean("TRue123");
		System.out.println(b);

		// ��װת������������
		Integer i4 = new Integer(5);
		System.out.println(i4 + "10");
		int i5 = i4.intValue();
		System.out.println(i5 + 10);
	}

	/**
	 * @Title: test 
	 * @Description: TODO �Զ�װ����Զ����� 
	 * @param: 
	 * @return: void 
	 * @date:2020��3��2�� ����11:42:39 
	 * @throws
	 */
	@Test
	public void test() {
		int i1 = 10;
		Integer i2 = i1;
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);

		// ����
		int i3 = i2;
		System.out.println("i3 = " + i3);

		double d1 = 12.3;
		Double d2 = d1 + 10;
		System.out.println(d2);

		boolean b = d2.equals(d1);
	System.out.println(b);

	}

	/**
	 * @Title: test4 
	 * @Description: TODO ��װת�ַ���
	 * @param: 
	 * @return:void
	 *  
	 * @date:2020��3��2�� ����11:49:43 
	 * @throws
	 */
	@Test
	public void test4() {
		int i1 = 10;
		Integer i2 = new Integer(20);

		// 1
		String str1 = i1 + "";
		System.out.println(str1);

		// 2
		String str2 = String.valueOf(i1);
		System.out.println(str2);

		String str3 = String.valueOf(i2);
		System.out.println(str3);
	}

	/**
	 * @Title: test5 
	 * @Description: TODO ��������������ת�ַ���(�Ƚϳ���) 
	 * @param: 
	 * @return:void 
	 * 
	 * @date: 2020��3��2�� ����11:51:58 
	 * @throws
	 */
	@Test
	public void test5() {
		String s1 = "123";
		int i1 = Integer.parseInt(s1);
		System.out.println(i1 + 10);

		String b1 = "True";
		Boolean b2 = Boolean.parseBoolean(b1);
		boolean b3 = Boolean.parseBoolean(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

	/**
	 * @Title: test6 @Description: TODO ������ @param: @return: void @date:
	 * 2020��3��2�� ����12:02:34 @throws
	 */
	@Test
	public void test6() {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);// 1.0

		Object o2;
		if (true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);// 1

	}

	/**   
	 * @Title: test7   
	 * @Description: TODO   
	 * @param:       
	 * @return: void   
	 * @date:   2020��3��2�� ����12:06:35      
	 * @throws   
	 */  
	@Test
	public void test7() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);// false

		//�Զ�װ���ֵ��[-128,127]�ķ�Χ��ʱ,ʹ��Interger�ײ㹲����IntegerCache����
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);// true
		System.out.println(n.hashCode());//1
		n = m+1;
		System.out.println(n.hashCode());//2
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);// false
	}
}