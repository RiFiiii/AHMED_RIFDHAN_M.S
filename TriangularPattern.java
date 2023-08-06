package assignment;

import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		
	    int size ;
		int row;
		int col;
		Scanner sc=new Scanner( System.in);
		System.out.println("Enter any number:");
		size=sc.nextInt();
		for(row=1;row<=size;row++) {
			for(col=1;col<=row;col++) {
				if(row>=col) {
				System.out.print(" # ");
			}else {
			System.out.print(" ");
		
			}
			}
			System.out.println();
	}
}
}