package oopsConpects;

import interFaceConcept.WebDriver;

public class SecondClass implements WebDriver {

	

	@Override
	public void getPageSource() {
	System.out.println(a);
		
	}
	
	

	
	public static void main(String[] args){
		WebDriver sc = new SecondClass();
		sc.getPageSource();
		WebDriver.get();
		
	}




	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}
	



}
