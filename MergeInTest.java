package mypkg;
class MergeInTest{
	public static void main(String[] args){
		int[] a={2,4,8,15,17};
		int[] b={3,9,18,25,30,0,0,0,0,0};
		MergeScnd ms=new MergeScnd();
		int[] c=ms.mergeIn(a,b);
	}
}
