package a1_javaTask;

public class String_Reverse {

	public static void main(String[] args) {
		String input="aBcD eFgH";
		method1(input);
	}

	public static void method1(String input) {
		//HgFe DcBa
		for(int i=(input.length()-1);i>=0;i--) {
			System.out.print(input.charAt(i));
		}
	}

	public static void method2(String input) {
		//DcBa HgFe 
		String[] split=input.split(" ");
		for(int i=0;i<input.length();i++) {
//			if(input.equals())
		}
	}
}
