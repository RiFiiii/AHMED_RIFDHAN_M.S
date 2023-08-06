package assignment;

import java.util.Scanner;

public class TimeTable {

	
	public static void main(String[] args) {
		
		 int row;
		 int col;
		 int number;
		 
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter a Number");
//		 number=sc.nextInt();
//		 sc.close();
		 
		 for(row=1;row<=10;row++) {
			 for(col=1;col<=10;col++) {
				number=row*col;
				System.out.printf("%4d",number);
			 }
			 System.out.println();
		 }
		
	}
}
