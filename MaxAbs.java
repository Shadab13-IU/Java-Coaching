package mypkg;
interface Parent{
	void show();
}
class Child implements Parent{
	public void show(){
		System.out.println("Show of Child");
	}
	public void display(){
		System.out.println("Show of Display");
	}
}
class Generator{
	public static Parent factory(){
		Parent p = new Child();
		return p;
	}
} 
