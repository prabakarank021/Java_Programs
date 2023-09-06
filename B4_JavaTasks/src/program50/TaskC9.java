package program50;

import java.util.Scanner;

public class TaskC9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int fib=0;
		for(int i=0;i<=input;i++) {
				int temp=fib;
				fib=temp+(fib+1);
				temp=fib;
				System.out.print(" "+temp);
		}
	}
}