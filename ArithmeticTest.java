
/*
 *Test Arithmetic Operator
 **/


package assignment;

public class ArithmeticTest {
	
	public static void main(String[] args) {
		 int num1=98;
		  System.out.println(num1);
		 num1=99;
		 System.out.println(num1);
		 int num2=5;
		 
		 int sum,difference,multiplication,quotient,remainder; //Declared 5 int variables to hold results
		 
		 
		 // perform arithmetic operators
		 
		 
		 sum=num1+num2;
		 
		 difference=num1-num2;
		 
		 multiplication=num1*num2;
		 
		 quotient=num1/num2;
		 
		 remainder=num1%num2;
		 
		 System.out.println(num1);
		 
		 System.out.println(num2);
		 
		 System.out.println(sum);
		 
		 System.out.println(difference);
		 
		 System.out.println(multiplication);
		 
		 System.out.println(quotient);
		 
		 System.out.println(remainder);
		 
		 ++num1; // Increment the value stored in the variable "number 1"
		 		 
		 		 //same as"num1 = num1 + 1"
		 
		 --num2; //Decrement the value stored in the variable "number 2"
		 
		 		 //same as "number2 =number2 - 1"
		 
		 System.out.println("Number1 after increment is" + num1);
		 
		 System.out.println("Number 2 after decrement is"+ num2);
		 
		 quotient = num1/num2;
		 
		 System.out.println("The New quotient of" + num1 + " and " +num2+ " is " +quotient);
		 
		 int number1=98;
		 
		 double number2=19.99;
		 
		 
		 // ++x ->  x = x + 1;
		 
		 
		 double sum1=number1+number2;
		 double sum2=number1-number2;
		 double sum3=number1*number2;
		 double sum4=number1/number2;
		 double sum5=number1%number2;
		 System.out.println("The Addition of truncate integer..:"+sum1);
		 System.out.println("The Difference of truncate integer..:"+sum2);
		 System.out.println("The Multiplication of truncate integer..:"+sum3);
		 System.out.println("The Quotient of truncate integer..:"+sum4);
		 System.out.println("The Remainder of truncate integer..:"+sum5);
		 
		
		  
	}

}
