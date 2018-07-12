package staticPackage;

public class ForStatic {

	static int a = 10;
	int b = 10;

	{
		System.out.println("Am in Third Normal Block");
		
	}
	
	static {
		System.out.println("Am in Second Static Block");
		
	}
	
	static int add(int a, int b) {
		
		return a + b;
	}

	public int m2() {
		System.out.println(a);
		System.out.println("AM in method3");
		return 6;

	}

	public String m3() {
		System.out.println("AM in method3");
		return "String Type";
	}

	public boolean m4() {
		System.out.println("AM in method3");
		return true;
	}

	public static void main(String[] args) {
		System.out.println(add(10,30));
	}

}
