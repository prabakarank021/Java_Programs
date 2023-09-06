package program50;

public class TaskA7 {

//	print prime number from 1 to 50 - Divided by 1 and itself

	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			int temp = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					temp=1;
				}
			}
			if (temp == 0) {
				System.out.println(i);
			}
		}
	}
}
