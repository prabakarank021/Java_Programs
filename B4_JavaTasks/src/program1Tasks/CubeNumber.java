package program1Tasks;

import java.util.Scanner;

public class CubeNumber {

//	.You are given with a number "N", find its cube.
//	Input Description:
//		A positive integer is provided.
//		Output Description:
//		Find the cube of the number.
//		Sample Input :
//		2
//		Sample Output :
//		8

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int a = sc.nextInt();
		
		int cube=a*a*a;
		System.out.println("The given number gube value is - "+cube);
	}
}
