package mypkg;
class RunningSum{
	public static void main(String[] args){
		int[] a={2,5,7,9,3,6};
		int i=0;
		int j=a.length-1;
		while(i<j){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int k=0; k<a.length; k++){
			System.out.print(a[k]+" ");
		}
		System.out.println();
		/*for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println();
		for(int i=1; i<a.length; i++){
			a[i]=a[i]+a[i-1];
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println();*/
	}
}
