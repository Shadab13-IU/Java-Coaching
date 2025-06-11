package mypkg;
public class ConstructorTest{
	public static void main(String[] args){
		//ChildTest ct = new ChildTest();
		ParentTest pt= new ChildTest();
		pt.display();
		pt.show();
	}
}
