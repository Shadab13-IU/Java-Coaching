package mypkg;
import java.lang.*;
class StaticDemo{
	static{
		System.out.println("Static Block Called");
	}
	int x=10;
	//static int y=20;*/
	public static void main(String[] args){
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.x);
		//StaticDemo sd2=new StaticDemo();
		/*System.out.println(sd.x+" "+StaticDemo.y);
		System.out.println(sd2.x+" "+StaticDemo.y);
		sd.x=25;
		sd.y=50;
		System.out.println(sd.x+" "+StaticDemo.y);
		System.out.println(sd2.x+" "+StaticDemo.y);*/
	}
}
