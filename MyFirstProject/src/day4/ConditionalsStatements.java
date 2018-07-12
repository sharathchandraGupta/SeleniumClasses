package day4;

import java.util.Scanner;

public class ConditionalsStatements {

	public static void main(String[] args) {

		/*Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		*/
		

	

	/*	if(a % 5 == 0){
			if(a>0){
				System.out.println(a + " : positive and is divisible by 5");
				System.out.println("print only if condition is ture");
			}
		}else if(a>0){
			System.out.println(a + " :positive and is not divisible by 5");
			System.out.println("print only if condition is false");	
		}else{
			System.out.println(a+" is Not positive");
		}*/
		
		
		
		String day = "Friday";
		
		if(day.equals("Sunday")){			
			System.out.println("Holiday");
		}else if(day.equals("Satuarday")){
			System.out.println("Holiday");
		}else if(day.equals("Monday")){
			System.out.println("Working Day");
		}else if(day.equals("Tuesday")){
			System.out.println("Working Day");
		}else if(day.equals("Wensday")){
			System.out.println("Working Day");
		}else if(day.equals("Thursday")){
			System.out.println("Working Day");
		}else if(day.equals("Friday")){
			System.out.println("Working Day");
		}else{
			System.out.println("In valid entry");
		}
		
		
		
	}

}
