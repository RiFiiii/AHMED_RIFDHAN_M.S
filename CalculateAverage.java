package assignment2;

import java.util.Scanner;

public class CalculateAverage {

	
	public static void main(String[] args) {
		int sum=0;
		double average;
		final int upperbound=100;
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Valid Number..:");
		num=sc.nextInt();
		
		for(int i=num;i<=upperbound;i++) {
			sum+=num;
			System.out.println(sum);
			average=sum/upperbound;
			System.out.println(average);
		}
		
	}
}
