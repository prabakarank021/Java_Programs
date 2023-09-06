package program50;

import java.util.Scanner;

public class TaskC8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int fib=0;
		for(int i=0;i<=input;i++) {
			fib=fib+i;
		}
		System.out.println(fib);
	}
}