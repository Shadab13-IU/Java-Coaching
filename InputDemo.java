package mypkg;
import java.util.Scanner;
class InputDemo{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter name:");
		String name = sc.nextLine().trim();
		System.out.println("Hello !"+name);
	}
}
