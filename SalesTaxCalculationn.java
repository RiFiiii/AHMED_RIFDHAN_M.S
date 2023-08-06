package assignment;

import java.util.Scanner;

public class SalesTaxCalculationn {

	
	public static void main(String[] args) {
		
		final double SalesTaxRate = 0.07; 
		 final int SENTINEL = -1; //
		 
		 double price; //
		 double actualprice,salestax;
		 
		 
		 double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax=0.0;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the tax-inclusive price in dollars (or -1 to end): ");
		 price=sc.nextDouble();
		 
		 while(price != SENTINEL) {
			 System.out.println(price);
			 if(price<=199) {
			 salestax=100*SalesTaxRate;
			 actualprice=price-salestax;
			 
			 System.out.printf("THE ACTUAL RATE IS.%.2f%n",actualprice);
			 System.out.printf("THE SALESTAX IS.%.2f%n",salestax);
				 
			 }else if(price<=299) {
				 salestax=100*SalesTaxRate;
				 actualprice=price-salestax;
				 System.out.printf("THE ACTUAL RATE IS..%.2f%n",actualprice);
				 System.out.printf("THE SALESTAX IS.%.2f%n",salestax);
			 }else if(price<=399) {
				 salestax=100*SalesTaxRate;
				 actualprice=price-salestax;
				 System.out.printf("THE ACTUAL RATE IS..%.2f%n",actualprice);
				 System.out.printf("THE SALESTAX IS.%.2f%n",salestax);
			 }else if(price<=499) {
				 salestax=100*SalesTaxRate;
				 actualprice=price-salestax;
				 System.out.printf("THE ACTUAL RATE IS..%.2f%n",actualprice);
				 System.out.printf("THE SALESTAX IS.%.2f%n",salestax);
			 }else if(price<=599) {
				 salestax=100*SalesTaxRate;
				 actualprice=price-salestax;
				 System.out.printf("THE ACTUAL RATE IS..%.2f%n",actualprice);
				 System.out.printf("THE SALESTAX IS.%.2f%n",salestax);
			 }else {
			 
		     salestax=100*SalesTaxRate;
			 actualprice=price-salestax;
			 System.out.printf("THE ACTUAL RATE IS..%.2f%n",actualprice);
			 System.out.printf("THE SALESTAX IS.%.2f%n",salestax);
				 
			 }
			 System.out.printf("Enter the tax-inclusive price in dollars (or -1 to end): ");
			 totalPrice+=price;
			 price=sc.nextDouble();
			 totalActualPrice+=actualprice;
			 totalSalesTax+=salestax;
		 }
		 System.out.printf("The Total actual price:%.2f%n",totalActualPrice);
		 System.out.printf("The Total price:%.2f%n",price);
		 System.out.printf("The Total salesTax :%.2f%n",totalSalesTax);	 
				 System.out.println("Bye! ");
	}
}
