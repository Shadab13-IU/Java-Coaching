package mypkg;
class MergingTest{
	public static void main(String[] args){
		int[] a={3,6,9,25,29};
		int[] b={2,7,15,19,50,56};
		Merging mr=new Merging();
		mr.printarray(a,b);
		int[] d=mr.merge(a,b);
		mr.printMerge(d);
	}
}
