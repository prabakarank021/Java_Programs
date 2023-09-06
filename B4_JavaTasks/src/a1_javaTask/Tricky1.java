package a1_javaTask;

public class Tricky1 {

	public static class Test {
		private int x=10;
		private int y=20;
	}
	
	public static void main(String[] args) {
		Test ob=new Test();
		System.out.println(ob.x+" "+ob.y);
	}
}