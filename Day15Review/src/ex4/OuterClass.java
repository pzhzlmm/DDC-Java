/**  
 * @Title:  OuterClass.java   
 * @Package ex4   
 * @Description:    TODO  
 * @author: XinLan Wang   
 * @date:   2020��3��4�� ����3:40:25   
 * @version V1.0 
 */ 
package ex4;

/**   
 * @ClassName:  OuterClass   
 * @Description:TODO  
 * @author: XinLan Wang
 * @date:   2020��3��4�� ����3:40:25   
 *     
 */
public class OuterClass {
	public static void main(String[] args) {
		//������̬��Ա�ڲ���Ķ���
		Person.Dog dog = new Person.Dog();
		dog.shout();
		//�����Ǿ�̬�ĳ�Ա�ڲ���Ķ���
		//�Ǿ�̬���ж�����ܴ���
		Person p1 = new Person();
		Person.Bird bird = p1.new Bird();
		p1.age = 15;
		bird.shout();
		bird.show("huangli");
		
	}
}
class Person{
	//��Ա�ڲ���
	//�ɶ������Է���,������,�����,�ڲ����
	//�ɱ�abstract����,��ʾ�䲻��ʵ����
	//�����Ա�final����,��ʾ���ܱ��̳�
	//���Ա�����Ȩ�����η�,static����
	//�ɵ����ⲿ������Ժͷ���
	String name = "xinlan";
	int age;
	static class Dog{
		public void shout(){
			System.out.println("wangwang");
		}
	}
	
	class Bird{
		//����
		String name = "maque";
		public void show(String name){
			System.out.println(name);//�ֲ�
			System.out.println(this.name);//��ǰ
			System.out.println(Person.this.name);//�ϲ�
		}
		public void shout(){
			System.out.println("niaoer");
			eat();
			System.out.println(age);
		}
	}
	
	public void show(){
		System.out.println(name);
	}
	public void eat(){
		System.out.println("�˳Է�");
	}
	
	
	public void method(){
		class A{}
	}
	{
		class B{}
	}
	public Person(){
		class C{}
	}
}