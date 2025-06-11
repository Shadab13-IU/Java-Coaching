package mypkg;
public interface MyInterface{
	int age=20;
	void printer();
	default  void show(){
		System.out.println("Show Method");
	}
	static void display(){
		System.out.println("Display Method");
	}
}
