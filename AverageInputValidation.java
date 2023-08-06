package assignment;

import java.util.Scanner;

public class AverageInputValidation {
	public static void main(String[] args) {

		
		final int Numstudents=3;
		
		//declared variables
     	double mark;
//		int number=0;
		boolean isValid;
		int sum=0;
		double average;
//		isValid=false;
		
		Scanner sc=new Scanner(System.in);
	
		
		for(int studentNo=1;studentNo<=Numstudents;studentNo++) {
				System.out.println("Enter the mark(0-100) for student "+studentNo+" :");
				mark=sc.nextInt();
				isValid=false;
				
				
			do {
				
				if(mark>=1 && mark<=100) {
					isValid=true;
				}else {
					System.out.println("Please Enter a Valid Number.");
					System.out.println("Enter a student mark(0-100) for student "+studentNo+" : " );					
					mark=sc.nextInt();
				}
			}while(!isValid);
			sum+=mark;
			
//			System.out.println(sum);
			
		}
	
	}

}
