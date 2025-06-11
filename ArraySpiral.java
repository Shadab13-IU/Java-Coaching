package mypkg;
class ArraySpiral{
	public static void main(String[] args){
		int[] a[]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int flag=0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				if(i==0){
					System.out.print(a[i][j]+" ");
				}else if(i>0 && i<a.length-1){
					System.out.print(a[i][a[i].length-1]+" ");
					break;
				}else{
					System.out.print(a[i][a[i].length-j-1]+" ");
				}
			}
			flag=i;
		}
		int flag2=0;
		for(int i=flag-1; i>0; i--){
			for(int j=0; j<a[i].length; j++){
				if(i>0 && i<flag-1){
					if(j==a[i].length-1)break;
					System.out.print(a[i][j]+" ");
				}else{
					System.out.print(a[i][j]+" ");
					break;
				}
			}
			flag2=i;
		}
		for(int i=flag2+1; i<a.length-1; i++){
			for(int j=a[i].length-2; j>0; j--){
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();
	}
}
