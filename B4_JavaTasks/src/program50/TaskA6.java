package program50;

import java.util.Scanner;

public class TaskA6 {

//	prime number - Divided by 1 and itself

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}
}
