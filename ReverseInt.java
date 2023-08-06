package assignment;

import java.util.Scanner;

public class ReverseInt {

	
	public static void main(String[] args) {
		int inNumber;
		int inDigit;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Positive Nmbers..:");
		inNumber=sc.nextInt();
		
		while(inNumber >0) {
			inDigit=inNumber%10;
			
			System.out.print( inDigit);
			inNumber/=10;
//			System.out.println(inNumber);
		}
	}
}
