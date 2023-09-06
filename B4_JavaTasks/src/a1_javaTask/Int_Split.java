package a1_javaTask;

public class Int_Split {

	public static void main(String[] args) {
		int i=153;
		int j=0;
		while(i!=0) {
			j=i%10;
			System.out.println(j);
			i=i/10;
		}
	}
}