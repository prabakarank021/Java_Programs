package program50;

public class Task9 {

//	count digits of the number

	public static void main(String[] args) {
		int num=1234567;
		int digits=0;
		while(num>0) {
			digits++;
			num/=10;
		}
		System.out.println(digits);
	}
}
