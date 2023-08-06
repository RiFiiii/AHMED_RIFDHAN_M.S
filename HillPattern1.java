package assignment;

import java.util.Scanner;

public class HillPattern1 {
	public static void main(String[] args) {
		
     int row;
     int col;
      int rows;    
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size..:");
     rows=sc.nextInt();
     
	for(row=1;row<=rows;row++) {
		for(col=1;col<=rows;col++) {
			if((row+col>=rows+1)) {
				System.out.print("# ");					
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(col=2;col<=row;col++) {
			if(row>=col) {
				System.out.print("# ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}