package SmartGraduateAssignment;

import java.util.Scanner;

public class print_an_Integer {

	public static void main(String[] args) {
		 
		//creates a reader instance which takes
		
		//input from standard input-keyboard
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter a Number:");

		//nextnt() reads the integer from the keyboard
		
		int number=reader.nextInt();
		
		//println() prints the following line to the output screen
		
		System.out.println("you entered: "+number);
		
	}

}
