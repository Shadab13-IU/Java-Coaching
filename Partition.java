package mypkg;
class PartitionAlgo{
	int partition(int[] a,int low,int high){
		int pivot=low;
		int i=low+1,j=high-1;
		int temp=0,temp1=0;
		while(i<=j){
			while(i<=j && a[i]<=a[pivot])i++;
			while(i<=j && a[j]>=a[pivot])j--;
			if(i<=j){
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		temp1=a[pivot];
		a[pivot]=a[j];
		a[j]=temp1;
		return j;
	}
	void printarray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
