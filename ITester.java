package mypkg;
class ITester implements MyInterface{
	public void printer(){
		System.out.println("Printer Method");
	}
	public void show(){
		System.out.println("Show  Method of ITester");
	}
	public static void main(String[] args){
		ITester m = new ITester();
		m.printer();
		m.show();
		System.out.println(MyInterface.age);
		MyInterface.display();
		//m.age=30;
	}
}
