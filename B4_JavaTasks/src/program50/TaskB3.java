package program50;

// Max number in array

public class TaskB3 {

	public static void main(String[] args) {
		int[] a= {90,20,50,35,65,85};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("Max number in this array is - "+a[0]);
	}
}
