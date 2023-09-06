package program1Tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circumference {

//	5.	You are provided with the radius of a circle "A". Find the length of its circumference.
//	  Note: In case the output is coming in decimal, roundoff to 2nd decimal place. In case       the input is a negative number, print "Error".
//	  Input Description:
//	  The Radius of a circle is provided as the input of the program.
//	  Output Description:
//	  Calculate and print the Circumference of the circle corresponding to the input radius up to two decimal places.
//	  Sample Input :
//	  2
//	  Sample Output :
//	  12.57

//	 circumference = 2pir - 2*pi*r
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int radius = sc.nextInt();
		method1(radius);
	}
	
	public static void method1(int radius) {
//		way 1
		double pi = 3.14;
		double circumference = 0;
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		if (r > 0) {
			circumference = (2 * pi * r);
			System.out.printf("The circumference of the circle is - %.2f", Math.abs(circumference));
		} else {
			System.err.println(" ---Error--- The given radius of circle value is negative - " + r);
		}
	}
	
	public static void method2(int radius) {
//		way 2
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int r = sc.nextInt();

		DecimalFormat dec=new DecimalFormat("0.00");
		
		if (r >= 0) {
			double circumference = (2 * pi * r);
			System.out.println("The circumference of the circle is - "+dec.format(circumference));
		} else {
			System.err.println(" ---Error--- The given radius of circle value is negative - " + r);
		}
	}
}
