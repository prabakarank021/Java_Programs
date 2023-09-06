package program50;

// Count of character in string

public class TaskB8 {

	public static void main(String[] args) {
		String str = "welcome to java program";
		method1(str);
		method2(str);
		method3(str);
		method4(str);
	}

	public static void method1(String input) { // It shows count of char of a words without space using toCharArray method
		int count = 0;
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			Character x = ch[i];
			String y = x.toString();
			if (!y.equals(" ")) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void method2(String input) { // It shows count of char of a words with space
		char[] ch = input.toCharArray();
		System.out.println(ch.length);
	}

	public static void method3(String input) { // It shows count of char of a words without space using split method
		String[] arr = input.split("");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals(" ")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void method4(String input) { // It shows count of char of a words without space using toCharArray method
		int count=0;
		char[] ch=input.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(c!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
