package assignment;

import java.util.Scanner;

public class BoxPattern {

	
	public static void main(String[] args) {
		
		int row;
		int col;
		int size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size..:");
		size=sc.nextInt();
		
		for(row=1;row<=size;row++) {
			for(col=1;col<=size+1;col++) {
				if(row == 1 || row ==size || col ==1 || col ==size) {
					System.out.print("# ");					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
