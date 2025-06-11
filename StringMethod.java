package mypkg;
class StringMethod{
	public static void main(String[] args){
		String s1="lucknow";
		String s2=new String("Lucknow");
		boolean b=s1.equals(s2);
		System.out.println(b); // or s2.equals(s1);
		System.out.println(s1.length());
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3="  Lucknow Junction  ";
		String s4=s3;
		String s5=" Kanpur";
		String s6=s1+s5;
		String s7=s1.concat(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s3.length());
		s3=s3.trim();
		String s33=s3.substr(4);
																																																																	System.out.println(s33);
	}
}
