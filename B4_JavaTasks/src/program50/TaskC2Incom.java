package program50;

import java.util.Map;
import java.util.TreeMap;

// Count the each vowel words

public class TaskC2Incom {

	public static void main(String[] args) {
		String str = "welcome to java program";
		method1(str);
	}

	public static void method1(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		Map<Character, Integer> map=new TreeMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' 
					|| c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				if(map.containsKey(ch[i])) {
					Integer in=map.get(ch[i]);
					map.put(c, in+1);
					count++;
				} else {
					map.put(c, 1);
				}
				
			}
		}
		System.out.println("Count of vowel words - " + count);
	}

	public static void method2(String str) {
		String[] arr = str.split("");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o")
					|| arr[i].equals("u") || arr[i].equals("A") || arr[i].equals("E") || arr[i].equals("I")
					|| arr[i].equals("O") || arr[i].equals("U")) {
				count++;
			}
		}
		System.out.println("Count of vowel words - " + count);
	}
}
