package oopsInteritance;

import interFaceConcept.WebDriver;
import oopsConpects.SecondClass;

public class TC1 {

	private int x=10;
	
	 void add(int a, int b){
		System.out.println(a+b);
	}
	
	void mul(int a, int b){
		System.out.println(a*b);
	}
	

	public static void main(String[] args){
		WebDriver sc = new SecondClass();
	}

}
