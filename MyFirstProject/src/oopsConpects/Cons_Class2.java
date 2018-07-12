package oopsConpects;

public class Cons_Class2 extends FirstClass {

	public static void main(String[] args) {
		
		Cons_Class2 obj = new Cons_Class2();
		obj.getPageSource();
		obj.m1();
		obj.m2();
	}

	@Override
	public void getTitle() {
		System.out.println("To get the title");
		
	}

	public void getPageSource() {
		System.out.println("To get the page source");
		
	}

	@Override
	void m1() {
		 System.out.println("in method m1");
		
	}

}
