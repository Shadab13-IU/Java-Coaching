package mypkg;
class MyClass1 extends AdapterDemo{
	public void show(){
		System.out.println("Show of child");
	}
}
class MainClass{
	public static void main(String[] args){
		JobDone jd = new JobDone();
		jd.caller(new MyClass1());
	}
}
