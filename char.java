package mypkg;
class CharDemo{
	/*char g='\u0041';
	float a=3.15f;
	float b=2.7f;
	int c=10,d=20,e=30;
	boolean f=(++c<++d)&&(++d<++e);*/
	byte b1=10;
	byte b2=7;
	byte a=(byte)(b1&b2);
	byte b=(byte)(b1|b2);
	byte c=(byte)(b1^b2);
	byte d=(byte)(~b1);
	public static void main(String[] args){
		CharDemo ch=new CharDemo();
		System.out.println(ch.a+" "+ch.b+" "+ch.c+" "+ch.d);
		/*System.out.println(ch.a/ch.b);
		System.out.println(ch.a%ch.b);
		System.out.println(ch.c+" "+ch.d+" "+ch.e);*/
	}
};
