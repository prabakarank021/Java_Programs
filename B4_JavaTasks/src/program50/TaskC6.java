package program50;

// Convert every word reverse

public class TaskC6 {

	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		String str="welcome to java program";
		String[] sp=str.split(" ");
		String rev="";
		for(int i=0;i<sp.length;i++) {
			StringBuffer sb=new StringBuffer(sp[i]);
			StringBuffer sb1=sb.reverse();
			rev=rev+sb1+" ";
		}
		System.out.println(rev);
	}
	
	public static void method2() {
		String str="welcome to java program";
		String[] sp=str.split(" ");
		String rev="";
		for(int i=0;i<sp.length;i++) {
			String[] sp1=sp[i].split("");
			for(int j=(sp1.length-1);j>=0;j--) {
				rev=rev+sp1[j];
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
	
	public static void method3() {
		String str="welcome to java program";
		String[] sp=str.split(" ");
		String rev="";
		for(String sp1:sp) {
			String sp2="";
			for(int i=(sp1.length()-1);i>=0;i--) {
				char c=sp1.charAt(i);
				sp2=sp2+c;
			}
			rev=rev+sp2+" ";
		}
		System.out.println(rev);
	}
}
