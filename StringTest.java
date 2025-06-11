package mypkg;
class StringTest{
	public static void main(String[] args){
		String s1="Lucknow";
		String s5=s1;
		System.out.println(s1==s5);
		String s2=new String("Lucknow");
		String s3="Lucknow";
		String s4=new String("Lucknow");
		s1=s1+" Junction";
		System.out.println(s1==s5);
		/*System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s3);*/
	}
}
