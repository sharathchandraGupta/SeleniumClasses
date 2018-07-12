package keywordsConcept;

 public class FinalKeyword {

	 final int a;
	 
	 
	 
	 
	 static final int b;
	 
	FinalKeyword(int a){
		this.a=a;
	}
	
	static{
		b=30;	
	}
	
	final void m2(){
			System.out.println("Am in method 2 which is final");
	}
	
	final void m2(int a){
		System.out.println("Am in method 2 which is final");
	}
	
	public static void main(String[] args) {
		
	}

}
