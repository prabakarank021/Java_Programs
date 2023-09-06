package a1_javaTask;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		method2(year);

	}

	public static void method1(int year) {

		if (year % 4 == 0 || year % 400 == 0) {
			if (year % 100 != 0) {
				System.out.println(year + " is a Leap year");
			} else {
				System.out.println(year + " is not a Leap year");
			}
		} else {
			System.out.println(year + " is not a Leap year");
		}
	}

	public static void method2(int year) {

		String leap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? " is a Leap year"
				: " is not a leap year";
		System.out.println(year + leap);
	}
}
