package mypkg;
class QuickSortTest{
	public static void main(String[] args){
		int[] a={5,2,3,8,4,6,7};
		int low=0;
		QuickSort qr=new QuickSort();
		qr.quickSort(a,low,a.length);
	}
}
