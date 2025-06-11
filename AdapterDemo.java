package mypkg;
interface MyInterface{
	void printer();
	void show();
	void display();
}
class AdapterDemo implements MyInterface{
	public void printer(){}
	public void show(){}
	public void display(){}
}
class JobDone{
	void caller(MyInterface mi){
		mi.show();
	}
}

