package program2Tasks;

import java.util.Scanner;

public class AreaOfRectangle {

//	5. You are given A = Length of a rectangle & B = breadth of a rectangle. Find its area “C”.
//			(A and B are natural numbers)
//			Input Description:
//			The inputs are two natural numbers representing the length and the breadth of a rectangle.
//			Output Description:
//			Find the area of the rectangle formed by the provided input. Round off the answer to the first decimal place if required.
//			Sample Input :
//			2
//			3
//			Sample Output :
//			6

//	Area of rectangle = length * width (or) LW
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle - ");
		int length=sc.nextInt();
		System.out.println("Enter the width of the rectangle - ");
		int width=sc.nextInt();
		
		int areaOfRectangle=length*width;
		System.out.println("Area of rectangle is - "+areaOfRectangle);
	}
}
