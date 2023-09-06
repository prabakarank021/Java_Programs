package program50;

// Count of words in string

public class TaskB9 {

	public static void main(String[] args) {
		String str = "welcome to java program";
		String[] arr= str.split(" ");
		System.out.println("Number of words in this string - "+arr.length);
	}
}