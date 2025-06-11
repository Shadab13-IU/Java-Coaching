package mypkg;
class Outer{
	int x=10;
	class Inner{
		public void display(){
			System.out.println(x/*new Outer().x*/);
		}
	}
}
