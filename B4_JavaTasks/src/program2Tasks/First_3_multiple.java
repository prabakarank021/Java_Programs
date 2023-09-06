package program2Tasks;

import java.util.Scanner;

public class First_3_multiple {

//	9. Print the First 3 multiples of the given number "N". (N is a positive integer)
//	Note: print the characters with a single space between them.
//	Input Description:
//	A positive integer is provided to you as an input.
//	Output Description:
//	Print the First 3 multiples of the number with single spaces between them as an output.
//	Sample Input :
//	2
//	Sample Output :
//	2 4 6

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int a = sc.nextInt();
		
		if(a<0) {
			System.err.println("The given number is negative - "+a);
		}else {
			for(int i=1;i<=3;i++) {
				int sum=a*i;
				System.out.print(sum+" ");
			}
		}
	}
}
