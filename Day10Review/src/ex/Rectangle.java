package ex;

public class Rectangle {//����

	private double length;//����
	private double width;//���
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length,double width){
		
	}
	//�ṩ��Ķ��������
	
	//ͨ��������get()��set()����ȡ���������Ե�ֵ
	public void setLength(double l){
		length = l;
	}
	public double getLength(){
		return length;
	}
	
	public void setWidth(double w){
		width = w;
	}
	public double getWidth(){
		return width;
	}
	
	/**
	 * 
	 * @Description ���ؾ��ε����
	 * @author shkstart
	 * @date 2020��2��26������11:03:34
	 * @return
	 */
	public double findArea(){
		return length * width;
	}
	
	/**
	 * 
	 * @Description ������εĳ��ȺͿ��
	 * @author shkstart
	 * @date 2020��2��26������11:03:26
	 */
	public void printRectangle(){
		System.out.println("����Ϊ��" + length + ",���Ϊ��" + getWidth());
	}
	
	//���ؾ��ε��ܳ�����
}
