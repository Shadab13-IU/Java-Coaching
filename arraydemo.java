package mypkg;
import java.lang.*;
class Array{
	public static void main(String[] args){
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++){
			arr[i]=i*i;
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
