package assignment;

import java.util.Scanner;

public class AddIntergerInput {
	
	public static void main(String[] args) {
		
		int num1,num2,sum;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a First Integer..:"); //no new line for prompt message
		
		num1=s.nextInt();
		System.out.println("Enter a Second Integer..:");
		num2=s.nextInt();
		s.close();
		sum=num1+num2;
		System.out.println("the sum is..: "+sum);
	}

}
