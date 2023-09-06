package a1_javaTask;

// Count the number of caps and small character of given string 

public class CountStringCapSmall {

	public static void main(String[] args) {
		
		method2();
	}
	
	public static void method1() {
		String str="Welcome To Automation Testing";
		int caps=0;
		int small=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				if(Character.isUpperCase(ch)) {
					caps++;
				}
				if(Character.isLowerCase(ch)) {
					small++;
				}
			}
		}
		System.out.println(caps);
		System.out.println(small);
	}
	
	public static void method2() {
		String str="Welcome To Automation Testing";
		int caps=0;
		int small=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				if(ch>='a' && ch<='z') {
					small++;
				}
				if(ch>='A' && ch<='Z') {
					caps++;
				}
			}
		}
		System.out.println("Number of caps - "+caps);
		System.out.println("Number of small - "+small);
	}
}
