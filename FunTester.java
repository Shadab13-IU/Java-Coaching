package mypkg;
class FunTester{
	public static void main(String[] args){
		FClass fp = new FClass();
		//fp.caller(()->{System.out.println("Lucknownh");});
		fp.caller((s,t)->{System.out.println(t);System.out.println(s);},"Lucknow","kanpur");
	}
 }
