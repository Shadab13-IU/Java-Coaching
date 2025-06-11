package mypkg;
class A{
	public void display(){
		System.out.println("Display");
	}
}
class Outer{
	int x=10;
	A a = new A(){
		public void display(){
			super.display();
			System.out.println(x);
		}
	};
}
