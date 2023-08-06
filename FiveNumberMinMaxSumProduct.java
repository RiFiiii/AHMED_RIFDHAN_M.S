package assignment;

import java.util.Scanner;

public class FiveNumberMinMaxSumProduct {

	
	public static void main(String[] args) {
		int num1,num2,num3,num4,num5;
		
		int sum,product,max,min;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter a Number 1..:");
		
		num1=sc.nextInt();
		
		System.out.println("Please Enter a Number 2..:");
		num2=sc.nextInt();
		
		System.out.println("Please Enter a Number 3..:");
		num3=sc.nextInt();
		
		System.out.println("Please Enter a Number 4..:");
		num4=sc.nextInt();
		
	    System.out.println("Please Enter a Number 5..:");
		num5=sc.nextInt();
		
		sc.close();
		
		sum=num1+num2+num3+num4+num5;
		
		System.out.println("The sum is..:"+sum);
		
		product=num1*num2*num3*num4*num5;
		
		System.out.println("The Product is..:"+product);
		
		max=num1;
		if(max<num2) {
			max=num2;
		}if(max<num3) {
			max=num3;
		}if(max<num4) {
			max=num4;
		}if(max<num5) {
			max=num5;
		}System.out.println("The max Num..:"+max);
		min=num1;
		if(min>num2) {
			min=num2;
		}if(min>num3) {
			min=num3;
		}if(min>num4) {
			min=num4;
		}if(min>num5) {
			min=num5;
		}
		System.out.println("The max num..:"+min);
		
	}
}
