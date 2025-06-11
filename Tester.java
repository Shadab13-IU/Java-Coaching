class StaticDemo{
	static{
		System.out.println("Static block called");
	}
	{
		System.out.println("non Static block called");
	}
	StaticDemo(){
		System.out.println("Constructor called");
	}

//class Tester{
	public static void main(String[] args){
		System.out.println("Main called");
		StaticDemo sd=new StaticDemo();
		StaticDemo sd2=new StaticDemo();
	}
}
