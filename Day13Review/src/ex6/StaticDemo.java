
package ex6;

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println(new SDText().x+","+new SDText().y+","+new SDText().x);
	}
}
class SDText{
	static SDText sd=new SDText();
	static int x=3;
	static int y;
	public SDText(){
		x++;
		y++;
	}
}




