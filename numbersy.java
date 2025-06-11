package mypkg;
import java.lang.*;
class Number{
	short b=5;
	byte x=(byte)(~b);
	int x1=10;
	int y=012;
	int z=0xA2;
	int a=0b01110;
	int age=35;
	String name="Manoj kumaar";
	int c=350;
	//System.out.println("Name is %s and age is %d\n",name,age);
	public static void main(String[] args){
		Number n1=new Number();
		//System.out.println(n1.x+" "+n1.y+" "+n1.z);
		//System.out.println(n1.a);
		System.out.printf("Name is %s and  age is %d\n",n1.name,n1.age);
		System.out.printf("c in decimal=%d\n",n1.c);
		System.out.printf("c in octal is %o\n",n1.c);
		System.out.printf("c in hex is %x\n",n1.c);
	}
};
