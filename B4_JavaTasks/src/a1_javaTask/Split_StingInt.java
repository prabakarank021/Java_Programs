package a1_javaTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_StingInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

//		String input = "1ax2d3as4lk";
		// 123
		// axdaslk

		// regEx - regular pattern exhaust or java regular expression
		// regEx + replace - 1ax2d3as3lk

//		method1(input);
//		method2(input);
		method3(input);
	}

	public static void method1(String input) {
//		regEx + replace method 
		String alphabets = input.replaceAll("[0-9]", "");
		System.out.println("Print alphabets only - " + alphabets);

		String numbers = input.replaceAll("[a-zA-z]", "");
//		String num=numbers.replaceAll("[A-Z]","");
		System.out.println("Print numbers only - " + numbers);
	}

	public static void method2(String input) {
//     Split method 
		String[] splitnumbers = input.split("[a-zA-Z]");
		for (int i = 0; i < splitnumbers.length; i++) {
			if (!splitnumbers[i].equals(" ")) {
				System.out.print(splitnumbers[i]);
			}
		}
		System.out.println();

		String[] splitalphabets = input.split("[0-9]");
		for (int i = 0; i < splitalphabets.length; i++) {
			if (!splitalphabets[i].equals(" ")) {
				System.out.print(splitalphabets[i]);
			} 
		}
	}

	public static void method3(String input) {
		// regEx method
		Pattern ps = Pattern.compile("[a-zA-Z]");
		Matcher ms = ps.matcher(input);
		String numbers = ms.replaceAll("");
		System.out.println("Print numbers only - " + numbers);

		Pattern pn = Pattern.compile("[0-9]");
		Matcher mn = pn.matcher(input);
		String alphabets = mn.replaceAll("");
		System.out.println("Print alphabets only - " + alphabets);
	}
}