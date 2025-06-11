package mypkg;
class MaxTest{
	int max(int a,int b){
		return (a>=b)?a:b;
	}
	public static void main(String[] args){
		int x=10,y=15;
		MaxTest mt=new MaxTest();
		int k=mt.max(x,y);
		System.out.println(k);
	}
};
