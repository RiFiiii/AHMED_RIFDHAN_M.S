package javaGoldenLaps;

public class UncaughtException {
 
	public static void main(String[] args) {
	try {	 int x=0;
		 int y=50/x;
		 System.out.println("y ="+y);
	}catch(Exception Arithmetic) {
}
	}
}
/*
 * althrough this program will compile,but when you execute it,the java run-time system will generate an exception and display the following output on the console
 *java.lang,ArithmeticException:/zero
 *at.Demo.main(DEMO.JAVA:4) */
 