package program2Tasks;

import java.util.Scanner;

public class Date_Count {

//	3. You will be provided with a number. Print the number of days in the month corresponding to that number.
//	Note: In case the input is February, print 28 days. If the Input is not in valid range print "Error".
//	Input Description:
//	The input is in the form of a number.
//	Output Description:
//	Find the days in the month corresponding to the input number. Print Error if the input is not in a valid range.
//	Sample Input :
//	8
//	Sample Output :
//	31

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year - ");
		int year = sc.nextInt();
		System.out.println("Enter the month - ");
		int month = sc.nextInt();

		if (year % 2 == 0) {
			if (month == 2) {
				System.out.println("The given "+month+"nd month total days are - 29 ");
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("The given "+month+"th month total days are - 30 ");
			} else {
				System.out.println("The given "+month+"th month total days are - 31 ");
			}
		} else {
			if (month == 2) {
				System.out.println("The given "+month+"th month total days are - 28 ");
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("The given "+month+"th month total days are - 30 ");
			} else {
				System.out.println("The given "+month+"th month total days are - 31 ");
			}
		}
	}
}
