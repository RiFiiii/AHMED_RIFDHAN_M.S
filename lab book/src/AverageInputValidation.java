import java.util.Scanner;

public class AverageInputValidation {
	public static void main(String[] args) {
		
		final int stdNo=3;
		
		int number;
		boolean isValid; //boolean flag to control the inputvalidation loop
		
		int sum=0;
		double average;
		double mark;
		
		Scanner sc=new Scanner(System.in);
		
		for(int stud=1;stud<=stdNo;stud++) {
			System.out.println("Enter a Number From (0 to 100)"+stud);
			mark=sc.nextDouble();
			isValid=false;
			
			do {
				if(mark>0 && mark<=100) {
					isValid=true;
				}else {
					System.out.println("Enter a Valid Number.:");
					System.out.println("Enter a student mark(0-100) for student  "+stud+ " :");
					mark=sc.nextDouble();
				}
			}while(!isValid);
			sum+=mark;
			
		}
	}
}
