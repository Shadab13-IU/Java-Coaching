package mypkg;
import java.lang.*;
class StaticCheck{
	static void printer(){
		System.out.println("Static printer");
	}
	void show(){
		System.out.println("Non Static show");
	}
}
class StaticTester{
	public static void main(String[] args){
		//StaticTester sc=new StaticTester();
		//sc.show();
		//show(); // non static can't be called without objectin static member
		//StaticCheck.show();
		//printer();//can be called directly
		//StaticCheck.printer();//can be called  with class name
		//sc.printer();// can be called with  reference
		//sc.display();
		StaticCheck sc=new StaticCheck();
		StaticCheck.printer();
		sc.printer();
		sc.show();
	}
	/*void display(){
		//show();
		StaticCheck st=new StaticCheck();
		st.show();
		//StaticCheck.show();//non static can't call non static method with classname
		//printer();
		StaticCheck.printer();
		st.printer();
	}*/
}

