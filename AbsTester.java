package mypkg;
class AbsTester{
	public static void main(String[] args){
		/*AbsDemo ab = new AbsDemo();
		ab.printer();   ///Will through error */
		AbsChild ad = new AbsChild();
		ad.printer();
		ad.show();
	}
}
