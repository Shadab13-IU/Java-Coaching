package mypkg;
class TwoDArr2{
	public static void  main(String[] args){
		int[][] a=new int[3][4];
		int[][] b=new int[3][];
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<b.length; i++){
			b[i]=new int[i+1];
			for(int j=0; j<b[i].length; j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
