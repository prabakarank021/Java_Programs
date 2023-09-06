package a1_javaTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Task2 {

	public static void main(String[] arg) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 2, 6, 4 };

		HashMap map=new HashMap();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] != b[j]) {
				   map.put(i, a[i]);
				}
			}
		}
		
		Set s=map.keySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			int key=(int) it.next();
			System.out.println(key+" - "+map.get(key));
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(b[0]);
	}
}