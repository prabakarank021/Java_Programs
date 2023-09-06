package program50;

public class TaskA8 {

//	reverse the given string

	public static String str = "reverse string";

	public static void main(String[] args) {
		method2();
	}

	public static void method() {
		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void method1() {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	
	public static void method2() {
		String rev = "";
		for (int i = (str.length() - 1); i >= 0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
