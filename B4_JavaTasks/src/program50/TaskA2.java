package program50;

public class TaskA2 {

//	sum of digits

	public static void main(String[] args) {
		int num=12345678;
		int digits=0;
		int sum=0;
		while(num>0) {
			digits++;
			sum+=digits;
			num/=10;
		}
		System.out.println(sum);
	}
}
