package program50;

public class TaskA9 {

//	palindrome of string

	public static String str = "appa";

	public static void main(String[] args) {
		String rev=method2();
		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

	public static void method() {
		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static StringBuilder method1() {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse();
	}
	
	public static String method2() {
		String rev = "";
		for (int i = (str.length() - 1); i >= 0; i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
}
