package mypkg;
interface FunInterface{
	void printer(String s,String t);
}
//  When multiple argument is passed 
class FClass{
	public void caller(FunInterface fi,String s,String t){
		fi.printer(s,t);
	}
}
