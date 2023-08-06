package assignment;

import java.util.Scanner;

public class HillPattern {

	public static void main(String[] args) {
		
	
	int row;
	int col;
	int size;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size..:");
	size=sc.nextInt();
	
	for(row=1;row<=size;row++) {
	for	(col=row;row+col<=size+1;col++){
			if(row == 1 || row == size|| row== col ) {
				System.out.print("# ");
			}else {
				System.out.print(" ");
			}
		}
	System.out.println();
	}
	
}
}