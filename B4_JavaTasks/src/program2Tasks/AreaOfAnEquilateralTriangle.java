package program2Tasks;

import java.util.Scanner;

public class AreaOfAnEquilateralTriangle {

//	2. The area of an equilateral triangle is ¼(√3a2) where "a" represents a side of the triangle. You are provided with the side "a". Find the area of the equilateral triangle.
//	Input Description:
//	The side of an equilateral triangle is provided as the input.
//	Output Description:
//	Find the area of the equilateral triangle and print the answer up to 2 decimal places after rounding off.
//	Sample Input :
//	20
//	Sample Output :
//	173.21

//  √3 - Math.sqrt(3)
	
//	way 1
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int area=sc.nextInt();
//		
//		DecimalFormat dec=new DecimalFormat("0.00");
//		double equilateralTriangle=((Math.sqrt(3))*area*area)/4;
//		
//		System.out.println("The given number's area of an equilateral triangle - "+dec.format(equilateralTriangle));
//		
//	}
	
//	way 2
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area - ");
		int area=sc.nextInt();
		
		double equilateralTriangle=((Math.sqrt(3))*area*area)/4;
		
		System.out.printf("The given number's area of an equilateral triangle - %.2f",Math.abs(equilateralTriangle)); //173.21
//		System.out.printf("The given number's area of an equilateral triangle - "+equilateralTriangle); //173.2050807568877
		
	}
}
