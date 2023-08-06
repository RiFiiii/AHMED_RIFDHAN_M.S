package assignment;

import java.util.Scanner;

public class CheckerPattern {

	public static void main(String[] args) {
		
	
	
	int row;
	int col;
//	int number;
	int size;
	
	Scanner sc=new Scanner(System.in) ;
	System.out.println("Enter a Size.:");
	size=sc.nextInt();
	
	for(row=1;row<=size;row++) {
		for(col=1;col<=size;col++) {
//			number=row*col;
			if((row%2==0)) {
				System.out.print(" ");
			}
			System.out.print(" # ");
		}
		System.out.println();
	}
}
}