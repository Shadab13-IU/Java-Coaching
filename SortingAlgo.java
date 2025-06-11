package mypkg;
class SortingAlgo{
	/*public void bubbleSort(int[] a){
		int temp=0;
		for(int i=1; i<a.length; i++){
			int flag=0;
			for(int j=1; j<=a.length-i; j++){
				if(a[j]<a[j-1]){
					flag=1;
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
			if(flag==0)break;
		}
	}
	public void selectionSort(int[] a){
		int minindex=0,temp=0,flag=0,status=0;
		for(int i=1; i<a.length; i++){
			flag=0;
			minindex=i-1;
			for(int j=i; j<a.length; j++){
				if(a[j]<a[minindex]){
					flag=1;
					status=1;
					minindex=j;
				}
			}if(flag!=status)break;
			temp=a[minindex];
			a[minindex]=a[i-1];
			a[i-1]=temp;
		}
	}
	public void insertionSort(int[] a){
		int temp=0,j=0;
		for(int i=1; i<a.length; i++){
			j=i-1;
			temp=a[i];
			while(j>=0 && temp<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}*/
	void mergeWithInArray(int[] a,int low,int mid,int high){
			if(low>=high || low==mid+1 || mid==high)return;
			int m=mid-low+1;
			int n=high-mid;
			int[] firstArr=new int[m];
			int[] secondArr=new int[m];
			for(int i=low; i<=mid; i++)firstArr[i-low]=a[i];
			for(int i=mid+1; i<=high; i++)secondArr[i-mid-1]=a[i];
			int e=0,b=0,c=low;
			while(e<m && b<n){
				if(firstArr[e]<=secondArr[b])a[c++]=firstArr[e++];
				else a[c++]=secondArr[b++];
			}
			while(e<m)a[c++]=firstArr[e++];
			while(b<n)a[c++]=secondArr[b++];
	}
	void mergeSort(int[] a,int low, int high){
			if(high>low){
				int mid=(low+high)/2;
				mergeSort(a,low,mid);
				mergeSort(a,mid+1,high);
				mergeWithInArray(a,low,mid,high);
			}
	}
	// Counting sort
	void countingSort(int[] a){
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++){
			if(a[i]>max)max=a[i];
		}
		int[] freq=new int[max+1];
		for(int i=0; i<a.length; i++){
			freq[a[i]]++;
		}
		for(int i=1; i<freq.length; i++){
			freq[i]+=freq[i-1];
		}
		int[] b=new int[a.length];
		for(int i=a.length-1; i>=0; i--){
			b[freq[a[i]]-1]=a[i];
			freq[a[i]]--;
		}
		for(int i=0; i<a.length; i++){
			a[i]=b[i];
		}
	}
	// Radix 
	void countSort(int[] a,int placeValue){
		int[] finalArr=new int[a.length];
		int[] count=new int[10];
		for(int i=0; i<a.length; i++){
			count[(a[i]/placeValue)%10]++;
		}
		for(int i=1; i<10; i++){
			count[i]=count[i]+count[i-1];
		}
		for(int i=a.length-1; i>=0; i--){
			finalArr[count[(a[i]/placeValue)%10]-1]=a[i];
			count[(a[i]/placeValue)%10]--;
		}
		for(int i=0; i<a.length; i++){
			a[i]=finalArr[i];
		}
	}
	void radixSort(int[] a){
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++){
			if(a[i]>max)max=a[i];
		}
		for(int placeValue=1; max/placeValue>0; placeValue*=10){
			countSort(a,placeValue);
		}
	}
	public void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
