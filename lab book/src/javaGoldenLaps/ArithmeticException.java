package javaGoldenLaps;

public class ArithmeticException {

	public static void main(String[] args) {
		 int x,a;
		 
		 try {
			 x=0;
			 a=33/x;
			 System.out.println("THIS WILL BE BY PASSED.");
		 }
		 catch(Exception e) {
			 System.out.println("Division by zero.");
		 }
		 System.out.println("after catch statement.");
	}

}
