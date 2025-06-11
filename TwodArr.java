package mypkg;
class TwodArr{
	public static void main(String[] args){
		/*int[][] td={{1},{2,4,6,8},{10,20},{11,22,33,44},{5,10,15}};
		for(int i=0; i<td.length; i++){
			for(int j=0; j<td[i].length; j++){
				System.out.print(td[i][j]+" ");
			}
			System.out.println();
		}*/
		int[][] tda={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int sum=0;
		int sum1=0;
		for(int i=0; i<tda.length; i++){
			for(int j=0; j<tda[i].length; j++){
					if(i==j){
						sum=sum+tda[i][j];
					}
					if(i+j==4){
						sum1=sum1+tda[i][j];
					}
			}
		}
		System.out.println(sum+" "+sum1);
		//primary and secondary diagonal sum in 2d in single loop
		int pd=0;
		int sd=0;
		int k=tda.length-1;
		for(int i=0; i<tda.length; i++){
			pd=pd+tda[i][i];
			sd=sd+tda[i][k-i];
		}
		System.out.println(pd+" "+sd);
		// 2D Array Tranpose 
		int temp=0;
		for(int i=0; i<tda.length; i++){
			for(int j=0; j<=i; j++){
					temp=tda[i][j];
					tda[i][j]=tda[j][i];
					tda[j][i]=temp;
			}
		}
		for(int i=0; i<tda.length; i++){
			for(int j=0; j<tda[i].length; j++){
				System.out.print(tda[i][j]+" ");
			}
			System.out.println();
		}
	}
}

