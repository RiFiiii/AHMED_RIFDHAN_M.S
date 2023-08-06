package assignment;

public class DeclarationAndInt {

	
		public static void main(String[] args) {
			
			int number; //declared a variable named number of the type"Int" (integer)
			
			number=99; //assign a integer value of 99 to the variable "number".
			
			System.out.println(number);
			number=88; //re-assign a value of 88to number
			
			number=number+1; //evaluate "number + 1" and assignment the result back to "sum" , i.e add number into sum.
			
			int sum=0; //Declared an int variable named" sum and assign an initial value of 0.
 			
			sum=sum+number; //evaluate "sum+number" andassign the result back to "sum" , i.e add number into sum
			
			int num1=5,num2=6; //declared and initialized 2 int variables in one statement,separated by a comma.
			
			int mul=num1*num2;
			
			System.out.println(mul);
					
			double radius=7.5; //declared a variable named "radius" and initialized to 1.5
			
			String msg;  //declared a variable name msg of the type string msg;
			
			msg ="Hello"; //assign a double-quoted text string to a string  variable
			
			//int number; // ERROR : the variable named "number" has already been declared.
			
			//sum=55.66; //ERROR : The Variable "Sum" is an int.It Cannot be assigned a string
			
			//sum="Hello";
			
			System.out.println(radius);
			System.out.println(sum);
			System.out.println(number);
			System.out.println(msg);
			
			int x=90;
			
			x=x*7;
			
			System.out.println(x);
			
		}
}
