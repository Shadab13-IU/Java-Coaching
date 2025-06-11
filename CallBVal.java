package mypkg;
class CallBVal{
	int arrSum(int[] a){
		int sum=0;
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args){
		int[] a={2,3,5,6,7};
		CallBVal cb=new CallBVal();
		int result=cb.arrSum(a);
		System.out.println(result);
	}
}
