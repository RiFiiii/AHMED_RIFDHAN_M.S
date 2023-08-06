package assignment;

public class DebuggingTracingProgramsUsingaGraphicDebugger {

	
	public static void main(String[] args) {
		//print factorial
		
		int n=20;
		int factorial=1;
		
		//n!=1*2*3*4*...*n
		
		for(int i=1;i<=n;i++) { //i =1,2,3,...,n
			factorial=factorial*i; //*
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
	}
}
