package program50;

public class Task8 {

//	palindrome

	public static void main(String[] args) {
		
		int num = 152;
		int pal=num;
		int rev = 0;
		if (num > 0) {
			while (num > 0) {
				int n=num%10;
				rev=(rev*10)+n;
				num /= 10;
			}
			System.out.println(rev);
		} else {
			System.out.println("Given number is negative");
		}
		if(pal==rev) {
			System.out.println("palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}
	}
}
