package ex;

class Person{
	//属性
	String name;
	int age = 18;
	String sex;
	//构造器
	public Person(){
		System.out.println("山川异域，风月同天");
	}
	
	public Person(String name){
		this();
		this.name = name;
	}
	public Person(int age){
		this();
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public Person(String n,int a){
		this(n);
		age = a;
	}
	
	//方法
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void showInfo(){
		System.out.println("name : " + name + ",age : " + age);
	}
}