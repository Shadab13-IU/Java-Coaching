package mypkg;
class MergeScnd{
	public int[] mergeIn(int[] a,int[] b){
		int i=a.length-1,k=b.length-1,temp=0;
		int j=b.length-a.length-1;
		while(k>=0){
			if(a[i]<b[j]){
				b[k--]=b[j--];
			}else{
				b[k--]=a[i--];
			}
		}
		return b;
	}
}
