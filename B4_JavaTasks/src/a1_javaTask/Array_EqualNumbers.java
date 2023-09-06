package a1_javaTask;

import java.util.Arrays;

public class Array_EqualNumbers {

	public static void main(String[] arg) {
		int a[]= {1,2,3,4};
		int b[]= {5,2,6,4};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
	
}
