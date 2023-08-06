package assignment;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class LogicalOperator {

//	public static void main(String[] args) {
//	   int a=4;
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a Number: ");
//		a=sc.nextInt();
//		
//		if(a%2==0) {
//			System.out.println("Even Number:");
//		}
//		else
//		{
//			System.out.println("Odd Number...");
//		}
//		int b=20;
//		
//		System.out.println(a==b && a<b);
//		
//		System.out.println(a==10 && a<=10 && a>=10);

//	  public static void main(String[] args) {
//		// Scanner object is created
//	    Scanner scanner = new Scanner(System.in);
//	     // Read String input using scanner class
//	    String courseName = scanner.nextLine(); 
//	     // Print the scanned String
//	   System. out.println("Course: " + courseName); 
//
//	    LinkedList<String> cars = new LinkedList<String>();
//	    cars.add("Volvo");
//	    cars.add("BMW");
//	    cars.add("Ford");
//	    cars.add("Mazda");
//	    System.out.println(cars);
//	  
//	}
//}
	
		public static void main(String[] args) {
			
int year;
			// Create an object of Calendar class. 

					// Use getInstance() method to initialize the Calendar object.
				
						Calendar c=Calendar.getInstance();

					// Initialize the int variable year with the current year
				
						year=c.get(Calendar.YEAR)	;		
			System.out.println("Current Year: "+year);
		}}	
