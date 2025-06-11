package mypkg;
import java.util.Scanner;
class ExecptionDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator");
		int x= sc.nextInt();
		int[] arr=new int[x];
		for(int i=0; i<10; i++){
			arr[i]=i*i;
		}
		/*System.out.println("Enter Denominator");
		int y=sc.nextInt();
		int z=x/y;
		System.out.println("Result="+z);*/
	}
}
