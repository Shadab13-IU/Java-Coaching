package mypkg;
interface I1{
	void show();
}
class B implements I1{
	public void show(){
		System.out.println("SHow method");
	}
}
class A{
	public static I1 factory(){
		return new B();
	}
}
