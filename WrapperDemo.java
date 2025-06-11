package mypkg;
class WrapperDemo{
	public static void main(String[] args){
		int x=10;
		// Boxing manually
		Integer in =new Integer(x);
		Integer in2 =new Integer(20);
		Integer in3 =new Integer("35");
		int k=in;		//	this is Autounboxing
		System.out.println(k);
		// This is manual Unboxing
		int m = in.intValue();
		System.out.println(m);
		String s="20";
		int i=Integer.parseInt(s);
		System.out.println(i);
	}
}
