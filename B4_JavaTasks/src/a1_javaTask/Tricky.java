package a1_javaTask;

public class Tricky {

	public static void main(String[] args) {
		
	}

	public static void question1() {
		System.out.println('j' + 'a' + 'v' + 'a'); // ASCII value - 418
		System.out.println("j" + 'a' + 'v' + 'a'); // Java
		System.out.println('j' + "a" + 'v' + 'a'); // Java
		System.out.println('j' + 'a' + "v" + 'a'); // 203va
		System.out.println('j' + 'a' + 'v' + "a"); // 321a
	}

	public static void question2() {
//		if(true) //Compile time Error - break cannot be used outside of a loop or a switch
//		break;
	}

	public static void question3() {
		int $ = 10;
		int _$ = 20;
		int $_ = 30;
		int _ = 40;
		System.out.println($);
		System.out.println(_$);
		System.out.println($_);
		System.out.println(_);

//		Rules to Declare a Variable 
//		A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters such as _ underscore and $ dollar sign.
//		The first character must not be a digit.
//		Blank spaces cannot be used in variable names.
//		Java keywords cannot be used as variable names.
//		Variable names are case-sensitive.
//		There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
//		Variable names always should exist on the left-hand side of assignment operators.

	}

	public static void question4() {
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 500;
		Integer num4 = 500;

		if (num1 == num2) {
			System.out.println("num1==num2"); // True Because its in range of -127 to +128 That's why it store the same
												// memory
		} else {
			System.out.println("num1 !=num2"); // Skip
		}
		if (num3 == num4) {
			System.out.println("num3==num4"); // False Because its not in range of -127 to +128 That's why it store the
												// different memory
		} else {
			System.out.println("num3 !=num4"); // Print
		}

//		Options:
//			a) num1==num2, num3==num4
//			b) num1==num2, num3!=num4
//			c) num1!=num2, num3==num4
//			d) num1!=num2, num3!=num4

//		Answer: b) num1==num2, num3!=num4
//		Because Integer wrapper class always consider if the value(range between -127 to +128) is same then it store the same memory
//		If not in range it will allocate the different memory
	}

	public static void test() {
//		for (int i = 0; 1; i++) {  //We can't use non-zero value for conditions in java. we can use it in other languages like c,c++,etc.
//			System.out.println("Hello");
//			break;
//		}
		
		for (int i = 0; true; i++) { //we can use true or false for conditions in java.
			System.out.println("Hello");
			break;
		}
	}
	
	public static void underScore() {
		double a=2.546;
//		double b=2._546; //Error - We can't use underscore before or after the decimal point. 
		double c=2.5_4_6;
		
		System.out.println(0+' '); //char space ASCII value is 32 so it prints 32.
	}
		
}
