package com.atguigu.exer2;


public class GeometricTest {
    public static void main(String[] args) {
    	GeometricTest test = new GeometricTest();
    	MyRectangle r1 = new MyRectangle(2.3, 3.4, "white", 1.0);
    	MyRectangle r2 = new MyRectangle(3.4, 2.3, "white", 1.0);
    	
    	test.displayGeometricObject(r1);
    	test.displayGeometricObject(r2);
    	
    	test.equalsArea(r1, r2);
    	
    }
    
   
    public void equalsArea(GeometricObject g1,GeometricObject g2){

    	String str = (g1.findArea() == g2.findArea())? "两个几何图形的面积相等":"两个几何图形的面积不相等";
    	System.out.println(str);
    }

    
    public void displayGeometricObject(GeometricObject g){
        System.out.println(g.findArea());
    }
}
