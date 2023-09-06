package program50;

public class TaskA4 {

//	swap two number without 3rd variable

	public static void main(String[] args) {
			int a=10;
			int b=20;
			System.out.println("Before swap a="+a);
			System.out.println("Before swap a="+b);
			a=a+b; //a=30
			b=a-b; //b=10
			a=a-b; //a=20
			System.out.println("After swap a="+a);
			System.out.println("After swap b="+b);
	}
}
