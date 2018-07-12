package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 class C1 {

	 
	 protected int a;
	 private int b;
	 public int c;
	
	 
	public static void main(String[] args) {

		/*int a = 55;

		System.out.println("**************");
		System.out.println("**************");
		System.out.println("**************");
		
		int b=0; 
		try{
			b = a / 0;
		}catch(ArithmeticException e){
			System.out.println("Am in catch block");
//			e.printStackTrace();
		}
		
		System.out.println("###########");
		System.out.println("**************");
		System.out.println("**************");

		System.out.println(b);*/
		
		
		/*String FilePath = "D:\\Sharath\\Sharath_P\\MorningClass\\MyFirstProject\\TestData\\Book2.xlsx";
	
			FileInputStream fs = new FileInputStream(FilePath);
		*/
		
		
		
		int nr = 5;
		int nc=0;
		
		
		for(int i=1;i<=nr;i++){
		
			/*for(int j=0;j<i;j++){
				System.out.print("* ");
			}*/
			nc=1;
			
			while(nc<=i){
				System.out.print(nc);
				System.out.print("*");
				nc=nc+1;
			}
			
			System.out.println();
			
			
		}
		
		
		

	}

}
