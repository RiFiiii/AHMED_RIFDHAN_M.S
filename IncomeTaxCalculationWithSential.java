package assignment;

import java.util.Scanner;

public class IncomeTaxCalculationWithSential {

	
	public static void main(String[] args) {
		
		final int sentinel=-1; //terminating value for input
		
		final double tax1=0.1;
		final double tax2=0.2;
		final double tax3=0.3;
		
		double taxAbleIncome;
		double taxpayable;
		int init=20000;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Total Salary (or -1 to end)..:");
		
		taxAbleIncome=sc. nextDouble();
		
		while(taxAbleIncome != sentinel) {
			if(taxAbleIncome>0 && taxAbleIncome<=2000) {
				taxAbleIncome=taxAbleIncome-init;
				taxpayable=taxAbleIncome*0;
				
				
			}else if(taxAbleIncome>20000 && taxAbleIncome<=40000) {
				  taxAbleIncome=(taxAbleIncome-init);
				taxpayable=taxAbleIncome*tax1;
			
			}else if(taxAbleIncome>40000 && taxAbleIncome<=60000) {
				 taxAbleIncome=(taxAbleIncome-init);
				taxpayable=(taxAbleIncome-init)*tax2;
			}else {
				 taxAbleIncome=(taxAbleIncome-init);
				taxpayable=(taxAbleIncome-init) *tax3;
			}
				
				System.out.printf("taxpayable:%.2f%n",taxpayable);
		//System.out.print("Enter the Taxable income..:");
				
				taxAbleIncome=sc. nextDouble();
			}
			
			
			System.out.println("bye");
		}
}
