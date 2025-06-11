package mypkg;
abstract class AbsDemo{
	AbsDemo(){
		System.out.println("Parent Constroctor");
	}
	void printer(){
		System.out.println("Printer");
	}
	abstract void show();
}
