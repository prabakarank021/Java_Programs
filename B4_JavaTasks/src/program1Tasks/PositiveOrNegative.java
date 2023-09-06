package program1Tasks;

import java.util.Scanner;

public class PositiveOrNegative {

//	1.	Write a Java program to get a number from the user and print whether 
//	it is positive or negative.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number - ");
		int a = sc.nextInt();
		System.out.println("Enter the second number - ");
		int b = sc.nextInt();
		System.out.println("Enter the third number - ");
		int c = sc.nextInt();
		if (a > 0) {
			System.out.println("The given number is positive - " + a);
		} else {
			System.out.println("The given number is negative - " + a);
		}
		if (b > 0) {
			System.out.println("The given number is positive - " + b);
		} else {
			System.out.println("The given number is negative - " + b);
		}
		if (c > 0) {
			System.out.println("The given number is positive - " + c);
		} else {
			System.out.println("The given number is negative - " + c);
		}
	}
}
