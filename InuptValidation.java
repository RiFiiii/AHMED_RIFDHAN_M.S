package assignment;

import java.util.Scanner;

public class InuptValidation {

	public static void main(String[] args) {
		int number;
		int studentCount = 0;
		int sum=0;
		int average;    //sum divide by total
		
		
		boolean isValid; // boolean flag to control the loop

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark..:");
		number = sc.nextInt();

		do {

			if ((number > 0 && number <= 10) || (number >= 90 && number <= 100)) {
				studentCount++;
				if (studentCount > 4) {
					isValid = true;
				} else {
					isValid = false;
				}

				System.out.println("IN --- :" + number);
				System.out.println("Enter the mark (0-100) for student " + studentCount + " : " + number);

			} else if ((number > 10 && number < 90)) {
				System.out.println("OUT --- " + number);
				isValid = false;
			} else {
				System.out.println("OUT --- " + number);
				isValid = false;
			}
			if (!isValid) {
				number = sc.nextInt();

			}
		} while (!isValid);
		sum+=studentCount+number;
		System.out.println(sum);

	}

}