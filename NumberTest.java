package mypkg;
class NumberTest{
	public static void main(String[] args){
		int x=32;
		if((x&(x-1))==0){
			System.out.println("X is in power of 2");
		}else{
			System.out.println("X is not in power of 2");
		}
	}
}
