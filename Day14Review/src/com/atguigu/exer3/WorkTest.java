package com.atguigu.exer3;


public class WorkTest {	
	public static void main(String[] args) {
		Manager m1=new Manager("王皓",001,10000.0,5000);
		System.out.println(m1);
		m1.work();
		
		CommonEmployee c1=new CommonEmployee("王皓",001,5000);
		c1.work();
		System.out.println(c1);
		
		
		operate(m1);
	}
	
	public static void operate(Employee e){
		e.work();
	}
}
