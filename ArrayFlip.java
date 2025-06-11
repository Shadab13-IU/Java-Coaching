package mypkg;
class ArrayFlip{
	public static void main(String[] args){
		int[][] ff={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		for(int i=0; i<ff.length; i++){
			for(int j=0; j<ff[i].length; j++){
				System.out.print(ff[i][j]+" ");
			}
			System.out.println();
		}
		int temp=0;
		for(int i=0; i<ff.length; i++){
			for(int j=0; j<ff[i].length/2; j++){
				temp=ff[i][j];
				ff[i][j]=ff[i][ff[i].length-j-1];
				ff[i][ff[i].length-j-1]=temp;
			}
		}
		for(int i=0; i<ff.length; i++){
			for(int j=0; j<ff[i].length; j++){
				System.out.print(ff[i][j]+" ");
			}
			System.out.println();
		}
	}
}
