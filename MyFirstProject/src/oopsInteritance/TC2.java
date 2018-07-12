package oopsInteritance;

public class TC2   {

	void add(int x, int y){
		System.out.println(y-x);
	}
	
	public static void main(String[] args) {
		
		TC2 obj = new TC2();
		
		try {
			System.out.println("dfghjk");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.add(3,4);
//		obj.mul(4,5);		
		
		TC1 ob = new TC1();
			
	}

}
