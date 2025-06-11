package mypkg;
class TesterPvt{
	public static void main(String[] args){
		//PrivateDemo pd=new PrivateDemo(10);
		// System.out.println(pd.x); will through error as x is private so it's not accessible outside class
		//pd.display();
		PrivateDemoT pd = PrivateDemoT.factory(10);
		pd.show();
		PrivateDemoT pd1 = PrivateDemoT.factory(20);
		pd1.show();
	}
}
