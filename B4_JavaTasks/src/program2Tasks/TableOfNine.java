package program2Tasks;

import java.util.Scanner;

public class TableOfNine {

//	8. Using the method of looping, write a program to print the table of 9 till N in the format as follows:
//		(N is input by the user)
//		9 18 27...
//		Print NULL if 0 is input
//		Input Description:
//		A positive integer is provided as an input.
//		Output Description:
//		Print the table of nine with single space between the elements till the number that is input.
//		Sample Input :
//		3
//		Sample Output :
//		9 18 27

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int a = sc.nextInt();

		if (a == 0) {
			System.out.println("Null");
		} else {
			for (int i = 1; i <= a; i++) {
				int sum;
				sum = 9 * i;
				System.out.print(sum + " ");
			}
		}
	}
}
