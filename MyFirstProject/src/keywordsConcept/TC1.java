package keywordsConcept;

public class TC1 {
	
	

	protected int a=50;
	

	
	
	void m1(){
		System.out.println(a);	
	}
	
	
	void m2(){
		System.out.println(a);	
	}
	
	
	public static void main(String[] args) {
		
		TC1 obj = new TC1();
		obj.m1();
	}

}
