package mypkg;
class Merging{
	int[] merge(int[] a,int[] b){
		int[] c=new int[a.length + b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
			if(a[i]<=1b[j]){
				c[k++]=a[i++];
			}else{
				c[k++]=b[j++];
			}
		}
		if(i<a.length){
			for(int m=k; m<c.length; m++){
				c[m]=a[i++];
			}
		}else if(j<b.length){
				for(int l=k; l<c.length; l++){
					c[l]=b[j++];
				}
		}
		return c;
	}
	void printarray(int[] a,int[] b){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	void printMerge(int[] c){
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
}
