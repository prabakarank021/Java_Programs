package program50;

import java.util.LinkedHashSet;
import java.util.Set;

// Remove duplicate in array

public class TaskB7 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,10,30,50,20};
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		
		for(Integer data : s) {
			System.out.println(data);
		}
	}
}
