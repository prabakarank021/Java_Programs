package a1_javaTask;

public class StaticUse {

//	Java can't allow static keyword in local level

	public static void main(String[] args) {
		System.out.println(fun());
	}

//	static int fun() {
//		static int x=10; //Java can't allow static keyword in local level. In this case we try to give static keyword for variable x for local function basically java can't allow this.
//		return ++x;
//	}

//	static int fun() { //1st way
//		int x=10;
//		return ++x;
//	}

	static int x = 0; // 2nd way

	static int fun() {
		return ++x;
	}
}
