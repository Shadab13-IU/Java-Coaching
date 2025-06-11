package mypkg;
class SearchDemo{
	/*public int linearSearch(int[] a,int data){
		int index=-1;
		for(int i=0; i<a.length; i++){
			if(a[i]==data){
				index=1;
				break;
			}
		}
		return index;
	}*/
	public int  binarySearch(int[] a,int low,int high,int data){
		if(high<low)return -1;
		int mid=(low+high)/2;
		if(data==a[mid])return  mid;
		else if(data<a[mid])
			return binarySearch(a,low,mid-1,data);
		else
			return binarySearch(a,mid+1,high,data);
	}
}
