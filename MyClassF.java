package mypkg;
class MyClass{
	int x;
	private static MyClass  m=null;
	private Myclass(int a){
		x=a;
	}
	public static MyClass factory(int a){
		if(m==null){
			m=new MyClass(a);
		}
		return m;
	}
}

