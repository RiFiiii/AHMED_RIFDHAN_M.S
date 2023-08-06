package assignment;

import java.util.Scanner;

public class InputValidationBooleanFlag {
	
	public static void main(String[] args) {
		int numberIn;   //to be input
		boolean isValid;//boole	 an flag to control the loop
		
		Scanner sc=new Scanner(System.in);
		
//		 numberIn=sc.nextInt();
		
		
//		use a do-while loop controlled by a boolean flag
//		to repetably read the input until a valid input is entered
		
		isValid=false; //default assuming input is not valid
		
		
		do {
			System.out.println("Enter a number between 0-10 or 90-100 :");
			 numberIn=sc.nextInt();
			 if((numberIn >= 0 && numberIn<11)||(numberIn>=90 &&numberIn<=100)) {
			 
				 isValid=true;
			 }else {
				 System.out.println("please enter a valid number");}
			 }while(!isValid);
		System.out.println("you have entered.:"+numberIn);
	}

}
