package program50;

public class TaskA5 {

//	factorial value of given number

	public static void main(String[] args) {
			int num=5;
			int fac=1;
			while(num>0) {
				fac*=num;
				--num; // num-=1;int fac
			}
			System.out.println(fac);
	}
}
