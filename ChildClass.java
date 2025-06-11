package mypkg;
class ChildClass extends ParentClass{
	public void show(){
		//super.show();
		System.out.println("Show of child");
		super.show();
	}
	public static void main(String[] args){
		ChildClass cd = new ChildClass();
		cd.show(); 
	}
}
