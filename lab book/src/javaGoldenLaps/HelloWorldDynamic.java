package javaGoldenLaps;

import java.util.Scanner;
public class HelloWorldDynamic {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("please enter your name...:");
		String myname=Scan.next();//this will wait for keyboard input from you
		System.out.println("Welcome to java....:"+myname);
		System.out.println("please input number1...:");
		int n1=Scan.nextInt();
		System.out.println("please input number2...:");
		int n2=Scan.nextInt();
		
		System.out.println("the addition of n1 and n2 is...:"+(n1+n2));
		 

	}

}
