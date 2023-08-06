package assignment;

import java.util.Scanner;

public class PensionCalculatorSentinel {

	public static void main(String[] args) {

		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;

		int salary, age;
		double employeeContribution = 0, employerContribution = 0, totalContribution = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salary.:");
		salary = sc.nextInt();

		System.out.println("SALARY --- " + salary);
		if (salary > 0 && salary <= 6000) {
			System.out.println("Enter a age..:");
			age = sc.nextInt();

			if (age <= 55) {
				employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
				employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
				totalContribution = employeeContribution + employerContribution;
				System.out.println("TOTALCONTRIBUTION : " + totalContribution);
			} else if (age >= 55 && age <= 60) {
				employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
				employerContribution = salary * EMPLOYER_RATE_55_TO_60;
				totalContribution = employeeContribution + employerContribution;
				System.out.println("TOTALCONTRIBUTION : " + totalContribution);
			} else if (age >= 60 && age <= 65) {
				employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
				employerContribution = salary * EMPLOYER_RATE_60_TO_65;
				totalContribution = employeeContribution + employerContribution;
				System.out.println("TOTALCONTRIBUTION : " + totalContribution);
			} else {
				employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
				employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
				totalContribution = employeeContribution + employerContribution;
				System.out.println("TOTALCONTRIBUTION : " + totalContribution);
			}

			System.out.println("The employee's Contribution is..: " + employeeContribution);
			System.out.println("The employer's Contribution is..: " + employerContribution);
			System.out.println("The Total Contribution..:" + totalContribution);
		} else {
			if (salary < 0) {
				System.out.println("BYE :)");
			} else if (salary >= 6000) {
				System.out.println("Please below 6000 salary ceiling");
			} else {
				System.out.println("Please enter  valid data");
			}

		}
	}
}