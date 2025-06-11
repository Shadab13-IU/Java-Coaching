package mypkg;
class ReverseTest{
	public static void main(String[] args){
		int x=-1331;   //3124;
		int original=x;
		int result=0;
		if(x<0){
			System.out.println("Number is negative");
		}else{
			while(x!=0){
			result=(result*10)+(x%10);
			x=x/10;
			}
		}
		if(result==original){
			System.out.println("Number is pallindrome");
		}else{
			System.out.println("Number isn't pallindrome");
		}
	}
};

