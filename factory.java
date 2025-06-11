package mypkg;
class PrivateDemoT{
	private int x;
	private static PrivateDemoT m=null;
	PrivateDemoT(int a){x=a;}
	public void show(){
		System.out.println("x "+x);
	}
	synchronized public static PrivateDemoT factory(int x){
		if(m==null){
			m= new PrivateDemoT(x);
		}
		return m;
	}
}
