package a1_javaTask;

public class CallByVAndR {
	
//	Call-by-reference or pass-by-reference is not preferable in Java
	
	public static int a=10;
	public static int b=20;
	
	public int sum(int c,int d) {
		int e=c+d;
		return e;
	}
	
	public void add(int f, int g) {
		System.out.println("Add of two num is - "+(f+g));
	}
	
	
	public static void main(String[] args) {
		CallByVAndR ob=new CallByVAndR();
		int h=ob.sum(30,40); //Call By Value is possible in java
		System.out.println("Sum of two num is - "+h);
		ob.add(ob.a,ob.b);//Call By Reference - In java call by reference not preferable because value can chance at any time.
	}
	
}
