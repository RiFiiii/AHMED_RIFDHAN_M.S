package assignment;

import java.util.Scanner;

public class SphereCompute {

	
	public static void main(String[] args) {
		double surfaceArea; //4*pi*r*r
		
		double volume; //   4/3*pi*r*r*r;  or basearea*height
		
		double baseArea; // pi*r*r;
		
		double height;
		
		double pi=Math.PI;
		
		double radius;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Radius.:");
		
		radius=sc.nextDouble();
		
		System.out.println("enter the Height.:");
		
		height=sc.nextDouble();
		
		sc.close();
		
		surfaceArea=4*pi*radius*radius;
		
		System.out.println("The surfaceArea is..:"+surfaceArea);
		
		baseArea=pi*radius*radius;
		
		System.out.println("The baseArea is..:"+baseArea);
		
		volume=baseArea*height;
		System.out.println("The volume is..:"+volume);
	}
}
