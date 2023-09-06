package program50;

// Convert first letter of the each word should be in caps

public class TaskC7 {

	public static void main(String[] args) {
		String str="welcome to java program";
		String str1="";
		String[] sp=str.split(" ");
		for(int i=0;i<sp.length;i++) {
			char ch=sp[i].charAt(0);
			char a=Character.toUpperCase(ch);
			String b=sp[i].substring(1);
			str1=str1+a+b+" ";
		}
		System.out.print(str1);
	}
}
