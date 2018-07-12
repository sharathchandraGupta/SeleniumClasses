package day4;

import java.awt.SecondaryLoop;

public class Loops {

	public static void main(String[] args) {

		int i;
		int j;
		
		FirstLoop:
		for(i=1;i<=3;++i){
			
			SecondLoop:
			for(j=1;j<=3;j++){
				System.out.println(i+" "+j);
				if(i==2&&j==2){
					break ;
				}
			}
			
			
		}
		
	}

}
