package mypkg;
class A{
	void printer(){
		var i=20;
		System.out.println("Var Keyword");
		System.out.println(i);
	}
	int add(var x,var y){// will generate error not allowed 
		return x+y;
	}
}
class VarDemo{
	public static void main(String[] args){
		var a=new A();
		a.printer();
		System.out.println(a.add(2,3));
	}
}

