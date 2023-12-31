package program2Tasks;

import java.util.Scanner;

public class Nth_TermSeries {

//	10. You are provided with a number "N", Find the Nth term of the series: 1, 4, 9, 16, 25, 36, 49, 64, 81, .......
//	(Print "Error" if N = negative value and 0 if N = 0).
//	Input Description:
//	An integer N is provided to you as the input.
//	Output Description:
//	Find the Nth term in the provided series.
//	Sample Input :
//	18
//	Sample Output :
//	324

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int a = sc.nextInt();

		if (a < 0) {
			System.err.println("The given number is negative - " + a);
		} else if (a == 0) {
			System.err.println("The given number is zero - " + a);
		} else {
			int sum = 0;
			for (int i = 1; i <= a; i++) {
				sum = i * a;
			}
			System.out.println(sum);
		}
	}
}
