package assignment;

import java.util.Scanner;

public class TriangularPatternB {

	public static void main(String[] args) {
		int size;
		int row;
		int col;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size.:");
		size=s.nextInt();
		for(row=1;row<=size;row++) {
			for(col=1;col<=size;col++) {
				if(row+col>=size+1) {
				System.out.print("* ");
			}else {
			System.out.print(" ");

		}
				
	}
			System.out.println();
}
	
}
	
}