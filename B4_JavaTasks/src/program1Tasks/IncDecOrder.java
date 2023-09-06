package program1Tasks;

import java.util.Scanner;

public class IncDecOrder {

//	4.	Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number - ");
		int a=sc.nextInt();
		System.out.println("Enter the second number - ");
		int b=sc.nextInt();
		System.out.println("Enter the third number - ");
		int c=sc.nextInt();
		System.out.println("Enter the fourth number - ");
		int d=sc.nextInt();
		
		if(a<b&b<c&c<d) {
			System.out.println("Given numbers are increasing order");
		}else if(a>b&b>c&c>d) {
			System.out.println("Given numbers are decreasing order");
		}else {
			System.out.println("Given numbers are neither increasing and decreasing order");
		}
	}
}
