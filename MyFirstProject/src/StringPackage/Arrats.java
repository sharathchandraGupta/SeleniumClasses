package StringPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Arrats {

	public static void main(String[] args) {
		int a = 10;
		
		Arrays[][] arr = new Arrays[2][3];
		
		int marks[] = new int[5];
		
		
		String[] subjects = new String[6];

	/*	int arrSize = arr.length;
		
		System.out.println("Size of array is:" +arrSize);
		
		for(int i=0;i<arrSize;i++){
			System.out.println("Value of arr at index "+i+" is :" +arr[i]);
		}*/
		
		

		Scanner sc = new Scanner(System.in);
		int subjectsSize = subjects.length;
		
		for(int i=0;i<subjectsSize;i++){
			
			subjects[i]=sc.next();
//			System.out.println("Marks for sub"+i+"is " +marks[i]);
		}
		
System.out.println(subjectsSize);
	for(int i=0;i<subjectsSize;i++){
			
//			marks[i]=sc.nextInt();
			System.out.println("Marks for sub "+i+" is " +subjects[i]);
		}
	}

}
