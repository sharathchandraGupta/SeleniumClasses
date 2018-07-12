package interFaceConcept;



public class IE implements WebDriver {

	@Override
	public void getTitle() {
		System.out.println("To get title");
		
	}

	@Override
	public void getPageSource() {
		 System.out.println("To get Page source");
		
	}

	public static void main(String[] args){
		IE obj = new IE();
		WebDriver ob = new IE();
		ob.getTitle();
		obj.getTitle();
	}

	
}
