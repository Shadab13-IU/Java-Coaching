package mypkg;
import java.util.Scanner;
class SearchTest{
	public static void main(String[] args){
		//int[] a={3,2,10,16,12,17,19,20};
		int a[]={2,3,5,7,8,9,14,17,20};
		System.out.print("Enter the number to search:");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		SearchDemo sd=new SearchDemo();
		//int c=sd.linearSearch(a,b);
		int c=sd.binarySearch(a,0,a.length,b);
		if(c>0){
			System.out.println("Number found");
		}else{
			System.out.println("Number not found");
		}
	}
}
