package mypkg;
class NestedTester{
	public static void main(String[] args){
		Outer ot= new Outer(); 
		Outer.Inner oi = ot.new Inner();
		//Above two line code may be written like below
		//Outer.Inner oi = new Outer().Inner();
		// if inner class is static then we can call inner class with outer class name
		//Outer.Inner oi=new Outer.Inner();
		oi.display();
	}
}
