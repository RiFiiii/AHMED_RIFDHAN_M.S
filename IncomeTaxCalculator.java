package assignment;

import java.util.Scanner;

public class IncomeTaxCalculator {

	
	public static void main(String[] args) {	
	
 
	// For Example taxable income =85000  
	
	//20000*0% + 20000*10% +20000*20%+25000*30%;
	
	final double Tax1=0.1;
	final double Tax2=0.2;
	final double Tax3=0.3;
	
	double taxAbleIncome;
	double taxPayable;
	double init=20000;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the income..:");
	
	taxAbleIncome=sc.nextDouble();
	
	
	if(taxAbleIncome>0 && taxAbleIncome<=20000) {
		taxPayable=init*0;
		
		
	}else if(taxAbleIncome>20000 && taxAbleIncome<=40000) {
		  taxAbleIncome=(taxAbleIncome-init);
		taxPayable=taxAbleIncome*Tax1;
		
	
	
	}else if(taxAbleIncome>40000 && taxAbleIncome<=60000) {
		 taxAbleIncome=(taxAbleIncome-init);
		double taxPayable1=20000*Tax1;
		taxAbleIncome=(taxAbleIncome-init);
		taxPayable=taxPayable1+taxAbleIncome*Tax2;
	}else {
		 taxAbleIncome=(taxAbleIncome-init);//85000 - 20000 =65000
		 double taxPayable1=20000*Tax1;    
		 taxAbleIncome=(taxAbleIncome-init); //  65000 -20000 = 45000  ///20000 %10 interest
		 double taxPayable2=20000*Tax2;//45000 -20000 =25000  // 20000 %20 interesrt
		 taxAbleIncome=taxAbleIncome-init;
		 taxPayable=(taxPayable1+taxPayable2)+taxAbleIncome*Tax3;
	}
		
	 
	System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
}
}