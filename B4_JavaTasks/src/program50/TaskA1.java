package program50;

public class TaskA1{

//	Arm strong number

	public static void main(String[] args) {
		int num=155;
		int temp=num;
		int arm=0;
		while(num>0) {
			int n=num%10;
			arm=arm+(n*n*n);
			num/=10;
		}
		System.out.println(arm);
		if(temp==arm) {
			System.out.println("Arm strong number");
		} else {
			System.out.println("Not an arm strong number");
		}
	}
}
