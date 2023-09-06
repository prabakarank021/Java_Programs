package program2Tasks;

import java.util.Scanner;

public class Simple_Interest {

//	6. You are given with Principle amount($), Interest Rate(%) and Time (years) in that order. Find Simple Interest.
//	Print the output up to two decimal places (Round-off if necessary).
//	(S.I. = P*T*R/100)
//	Input Description:
//	Three values are given to you as the input. these values correspond to Principle amount, Interest Rate and Time in that particular order.
//	Output Description:
//	Find the Simple interest and print it up to two decimal places. Round off if required.
//	Sample Input :
//	1000 2 5
//	Sample Output :
//	100.00

//	(S.I. = P*T*R/100) - Simple interest,principle amount, time, interest rate
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle amount - ");
		int amount=sc.nextInt();
		System.out.println("Enter time - ");
		int time=sc.nextInt();
		System.out.println("Enter interest rate - ");
		int interestRate=sc.nextInt();
		
		int simpleInterest=(amount*time*interestRate)/100;
		System.out.println("Simple interest is - "+simpleInterest);
	}
}
