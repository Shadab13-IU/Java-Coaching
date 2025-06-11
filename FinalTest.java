package mypkg;
class FinalTest extends FinalDemo{
	void show(){
		System.out.println("Show of child");
	}
	public static void main(String[] args){
		//FinalDemo fd = new FinalDemo(15);
		FinalTest ft = new FinalTest();
		ft.show();
		//System.out.println(fd.age);
		//fd.age=40;
		//System.out.println(fd.age);
	}
}

