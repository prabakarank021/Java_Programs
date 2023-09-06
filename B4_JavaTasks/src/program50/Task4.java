package program50;

public class Task4 {

//	Count even number from 1 to 100
	
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				count++;
			} 
		}
		System.out.println(count);
	}
}
