package a1_javaTask;

import java.util.Scanner;

public class ArrayOddSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr_size = 0;
		if (sc.hasNextInt()) {
			arr_size = sc.nextInt();
		}

		int[] arr = new int[arr_size];

		System.out.println("Enter the elements of an array: ");
		for (int i = 0; i < arr_size; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}

//		int [] arr= {10,20,30,40,50,60,70};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of all odd position in a array - " + sum);
	}
}
