package StringPackage;

import java.util.concurrent.SynchronousQueue;

public class StringClasses {
	
	
	public static void main(String[] args){
		
		StringClasses obj = new StringClasses();

		String str = "Welcome to Java and Selenium";
		
		/*int a = str.length();
		System.out.println(str.length());
		*/
		
		//String str1 = str.substring(3,7);
		
//		System.out.println("Lower Case");
//		System.out.println(str.toLowerCase());
//		
//		System.out.println("Upper Case");
//		System.out.println(str.toUpperCase());
	

//		System.out.println(str);
//		String str1 = str.replace("Java", "JAVA");
//		
//
//		String name = "Shar sharath";
//		
//		boolean flag = name.startsWith("Shar",0);
//		
//		System.out.println(flag);
		
	
//		
//		String name = "Shar sharath";
//		
//		boolean flag = name.endsWith("h");
//		
//		System.out.println(flag);
		
		
		
		String name = "Shar sharath";
		
		/*int inde = name.indexOf("h");
		
		System.out.println(inde);*/

		
		
//		char ch = name.charAt(0);
		
//		System.out.println(ch);
		
		
		
		/*if(name.toLowerCase().contains("Sharath".toLowerCase())){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}*/
		
		
//		String st = "Sharath";
//		
//		if(st.equalsIgnoreCase("SHARATH")){
//			System.out.println("Pass");
//		}else{
//			System.out.println("Fail");
//		}
		
		
		String str1 = "JAVAt"; 
		
		String[] st  = str1.split("");
		
//		System.out.println(st.length);
	/*	
		for(int i=0;i<st.length;i++){
			System.out.println(st[i]);
		}*/
		
		int[] i = {1,3,4,5,6,7,8,9,0,5,3,5,7,9,0,5,6};
		
		for(int A:i){
			System.out.println(A);
		}
		
		
	}
	

}
