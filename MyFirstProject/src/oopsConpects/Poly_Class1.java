package oopsConpects;

public class Poly_Class1 {

	static void add(int a,int b){
		System.out.println("Am in method 1");
		System.out.println(a+b);
	}
	
	
	static void add(int a,int b, int c){
		System.out.println("Am in method 2");
		System.out.println(a+b+c);
	}
	
	
	static void add(String a,String b, String c){
		System.out.println("Am in method 3");
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		add("Sharath","Java","Class");

	}

}
