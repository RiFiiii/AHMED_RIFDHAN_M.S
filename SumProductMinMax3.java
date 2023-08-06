package assignment;

import java.util.Scanner;

public class SumProductMinMax3 {
	
	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		int sum,product,min,max;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Value for Num1..:");
		num1=s.nextInt();
		
		System.out.println("Enter a Value for Num2..:");
		
		num2=s.nextInt();
		
		System.out.println("Enter a Value for Num3..:");
		num3=s.nextInt();
		s.close();
		
		sum=num1+num2+num3;
		System.out.println("The Sum is..:"+sum);
		
		product=num1*num2*num3;
		System.out.println("The Product is...:"+product);
		
		min=num1;
		if(num2<min) {
			min=num2;
		}if(num3<min) {
			min=num3;
			
		}
		System.out.println("The Minimum is..:"+min);
		
		
		max=num1;
		if(num2>max) {
			max=num2;
		}if(num3>max) {
			max=num3;
		}
		System.out.println("The Maximum is..:"+max);
	}

}
