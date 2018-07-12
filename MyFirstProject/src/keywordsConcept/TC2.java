package keywordsConcept;

public class TC2 extends TC1 {
TC2(int p) {
		super(p);		
	}

int a =20;

	

	void m2() {
		System.out.println(super.a);
		super.m2();
		System.out.println("Am form TC2: "+a);
	}

	public static void main(String[] args) {

		TC2 obj = new TC2(50);
		obj.m2();
		// System.out.println(super.a);

	}

}
