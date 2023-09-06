package program50;

public class Task7 {

//	reverse the number 123

	public static void main(String[] args) {
		
		another();
		
		int num = 15;
		int rev = 0;
		if (num > 0) {
			while (num > 0) {
				rev=num%10;
				System.out.print(rev);
				num /= 10;
			}
		} else {
			System.out.println("Given number is negative");
		}
	}
	
	public static void another() {
		int num=1234;
		int rev=0;
		while(num>0) {
			int n=num%10;
			rev=(rev*10)+n;
			num/=10;
		}
		System.out.println(rev);
	}
}
