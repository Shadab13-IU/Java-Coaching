package mypkg;
class SortingTest{
	public static void main(String[] args){
		//int[] a={6,9,5,2,8,3};
		//int a[]={5,3,8,9,2,4,6};
		SortingAlgo st=new SortingAlgo();
		//st.printArray(a);
		//st.bubbleSort(a);
		//st.printArray(a);
		//st.selectionSort(a);
		//st.insertionSort(a);
		//st.printArray(a);
		// Merge sort
		/*int[] a={3,4,5,1,2,6,7};
		st.printArray(a);
		st.mergeSort(a,0,a.length-1);
		st.printArray(a);*/
		// COUNTING SORT	
		/*int[] b={2,3,1,5,6,5,2,8,9,6,5,3};
		st.printArray(b);
		st.countingSort(b);
		st.printArray(b);*/
		int[] c={576,157,132,259,546,112,198};
		st.printArray(c);
		st.radixSort(c);
		st.printArray(c);
	}
}
