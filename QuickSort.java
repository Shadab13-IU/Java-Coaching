package mypkg;
class QuickSort{
	int partition(int[] a,int low,int high){
			int pivot=a[high];
			int i=low-1;
			int temp;
			for(int j=low; j<=high-1; j++){
				if(a[j]<=pivot){
					i++;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			temp=a[i+1];
			a[i+1]=a[high];
			a[high]=temp;
			return (i+1);
	}
	void quickSort(int[] a,int low ,int high){
			if(low<high){
				int mid=partition(a,low,high);
				quickSort(a,low,mid-1);
				quickSort(a,mid+1,high);
			}
	}												;
}
