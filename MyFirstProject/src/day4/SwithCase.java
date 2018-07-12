package day4;

public class SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String a = "Friday";			
		
		switch (a) {
		case "Sunday":
			System.out.println("Holiday");
			break;
		case "Satuarday":
			System.out.println("Holiday");
			break;
		case "Monday":
			System.out.println("WorkingDay");
			break;
		case "Tuesday":
			System.out.println("WorkingDay");
			break;
		case "Wensday":
			System.out.println("WorkingDay");
			break;
		case "Thursday":
			System.out.println("WorkingDay");
			break;
		case "Friday":
			System.out.println("WorkingDay");
			break;
		default:
			System.out.println("InValid Entry");

		}
	}
}
