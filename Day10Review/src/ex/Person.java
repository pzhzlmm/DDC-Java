package ex;

class Person{
	//����
	String name;
	int age = 18;
	String sex;
	//������
	public Person(){
		System.out.println("ɽ�����򣬷���ͬ��");
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
	
	//����
	public void eat(){
		System.out.println("�Է�");
	}
	
	public void showInfo(){
		System.out.println("name : " + name + ",age : " + age);
	}
}