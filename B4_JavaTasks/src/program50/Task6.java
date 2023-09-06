package program50;

public class Task6 {

//	print Odd sum from 1 to 80
	
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 80; i++) {
			if (i % 2 != 0) {
				sum+=i;
			} 
		}
		System.out.println(sum);
	}
}
