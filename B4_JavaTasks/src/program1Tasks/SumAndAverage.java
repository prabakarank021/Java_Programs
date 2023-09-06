package program1Tasks;

import java.util.Scanner;

public class SumAndAverage {

//	3.	 Write a program in  Java to input 5 numbers from keyboard and find their sum and average.
	
	public static void main(String[] args) {
		int sum=0;
		int average=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number - ");
		int a=sc.nextInt();
		System.out.println("Enter the second number - ");
		int b=sc.nextInt();
		System.out.println("Enter the third number - ");
		int c=sc.nextInt();
		System.out.println("Enter the fourth number - ");
		int d=sc.nextInt();
		System.out.println("Enter the fifth number - ");
		int e=sc.nextInt();
		
		sum=a+b+c+d+e;
		System.out.println("Sum of five value is - "+sum);
		average=sum/5;
		System.out.println("Average of five value is - "+average);
	}
}
