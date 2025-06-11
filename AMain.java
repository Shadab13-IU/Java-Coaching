package mypkg;
class ApiClass implements AInterface{
	public void show(){
		System.out.println("Show method");
	}
}
class Amain{
	public static void main(String[] args){
		AClass ac= new AClass();
		/*AInterface ap=*/ ac.display(new AInterface(){
			public void show(){
				System.out.println("Show method");
			}
		});
		//ac.display(ap);
	}
}
