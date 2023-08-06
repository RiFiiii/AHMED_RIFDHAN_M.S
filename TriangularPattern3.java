package assignment;

import java.util.Scanner;

public class TriangularPattern3 {

	
	public static void main(String[] args) {
		int row;
		int col;
		int size;
		
		//Required size is 8.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size.:");
		size=sc.nextInt();
		
		for(row=1;row<=size;row++) {
			for(col=1;col<=size;col++) {
				if(row+col<=size+1) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
