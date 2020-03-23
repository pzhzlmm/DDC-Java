/**  
 * @Title:  GeometricTest.java   
 * @Package com.atguigu.ex7   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��2��29�� ����2:56:59   
 * @version V1.0 
 */
package com.atguigu.ex7;

/**
 * @ClassName: GeometricTest
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020��2��29�� ����2:56:59
 * 
 */
public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		// �½�һ������Ϊ50,��ɫΪ��ɫ,�뾶Ϊ5��Բ
		GeometricObject geo1 = new Circle("��ɫ", 50, 5);
		// �½�һ������Ϊ50,��ɫΪ��ɫ,��Ϊ7,��Ϊ5�ķ�
		GeometricObject geo2 = new MyRectangle("��ɫ", 50, 7, 5);
		// �Ƚ�������״��С�������
		System.out.println(test.equalsArea(geo1, geo2));

	}

	// �����������������Ƿ����(����1)
	/*public boolean equalsArea(Object obj1, Object obj2) {
		if (obj1 == obj2) {
			return true;
		} else {
			GeometricTest test = new GeometricTest();
			return test.displayGeometricObject(obj1) == test.displayGeometricObject(obj2);
		}
	}*/
	public double equalsArea(GeometricObject g1, GeometricObject g2){
		String str = ((g1.findArea() == g2.findArea())?"���":"����");
		System.out.println(str);
				return 0.0;
	}

	// ��ʾ��������
	public double displayGeometricObject(Object obj) {
		if (obj instanceof MyRectangle) {
			MyRectangle rec = (MyRectangle) obj;
			// System.out.println("����");
			return rec.findArea();
		} else if (obj instanceof Circle) {
			Circle cir = (Circle) obj;
			// System.out.println("ԲԲ");
			return cir.findArea();
		} else {
			return 0.0;
		}
	}
}