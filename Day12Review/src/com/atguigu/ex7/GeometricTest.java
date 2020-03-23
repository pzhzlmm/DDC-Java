/**  
 * @Title:  GeometricTest.java   
 * @Package com.atguigu.ex7   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020年2月29日 下午2:56:59   
 * @version V1.0 
 */
package com.atguigu.ex7;

/**
 * @ClassName: GeometricTest
 * @Description:TODO
 * @author: XinLan Wang
 * @date: 2020年2月29日 下午2:56:59
 * 
 */
public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		// 新建一个重量为50,颜色为红色,半径为5的圆
		GeometricObject geo1 = new Circle("红色", 50, 5);
		// 新建一个重量为50,颜色为红色,长为7,宽为5的方
		GeometricObject geo2 = new MyRectangle("红色", 50, 7, 5);
		// 比较两个形状大小并且输出
		System.out.println(test.equalsArea(geo1, geo2));

	}

	// 测试两个对象的面积是否相等(方法1)
	/*public boolean equalsArea(Object obj1, Object obj2) {
		if (obj1 == obj2) {
			return true;
		} else {
			GeometricTest test = new GeometricTest();
			return test.displayGeometricObject(obj1) == test.displayGeometricObject(obj2);
		}
	}*/
	public double equalsArea(GeometricObject g1, GeometricObject g2){
		String str = ((g1.findArea() == g2.findArea())?"相等":"不等");
		System.out.println(str);
				return 0.0;
	}

	// 显示对象的面积
	public double displayGeometricObject(Object obj) {
		if (obj instanceof MyRectangle) {
			MyRectangle rec = (MyRectangle) obj;
			// System.out.println("方方");
			return rec.findArea();
		} else if (obj instanceof Circle) {
			Circle cir = (Circle) obj;
			// System.out.println("圆圆");
			return cir.findArea();
		} else {
			return 0.0;
		}
	}
}
