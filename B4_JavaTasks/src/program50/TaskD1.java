package program50;

import java.util.Scanner;

public class TaskD1 {

	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		String str = "welcome to java program";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.println("Given string contain ("+str.charAt(i)+") index of "+i);
			}
		}
	}
	
	public static void method2() {
		String str = "kshywnxmzp";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
		}
		if(count==0) {
			System.out.println("This String not contain vowel words");
		} else {
			System.out.println("This String is contain vowel words");
		}
	}
}
