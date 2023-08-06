package assignment;

import java.util.Scanner;

public class SumOfDigitsInput {

	
	public static void main(String[] args) {
		
		int number;
		int reverse;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number..:");
		number=sc.nextInt();
		
		while(number > 0) {
		 
				 reverse=number%10;
				sum+=reverse;
				System.out.println(reverse);
				number/=10;
//				?System.out.println(sum);
		}
		 
				System.out.println(sum);
			
			
		}
	}

