package program1Tasks;

import java.util.Scanner;

public class GreatestNum {

//	2.	Take three numbers from the user and print the greatest number.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number - ");
		int a=sc.nextInt();
		System.out.println("Enter the second number - ");
		int b=sc.nextInt();
		System.out.println("Enter the third number - ");
		int c=sc.nextInt();
		
		if(a>b&a>c) {
			System.out.println("a is greater - "+a);
		}else if(a<b&c<b) {
			System.out.println("b is greater - "+b);
		}else {
			System.out.println("c is greater - "+c);
		}
		
	}
}
