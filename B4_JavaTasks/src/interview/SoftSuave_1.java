package interview;

import java.util.Scanner;

public class SoftSuave_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int productType = sc.nextInt();
		int userID = sc.nextInt();

		if (productType >= 0 && productType <= 6) {
			if (userID >= 0 && userID <= 99999999) {
				int count = 0;
				while (userID > 0) {
					int n = userID % 10;
					if (productType == n) {
						count++;
					}
					userID /= 10;
				}
				System.out.println(count);
			} else {
				System.out.println("You're entered wrong userId");
			}
		} else {
			System.out.println("You're entered wrong product type");
		}
	}

}
