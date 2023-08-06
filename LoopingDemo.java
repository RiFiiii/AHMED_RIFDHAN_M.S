package assignment;


// Why Looping  ->  if you wan to repeat things again and again you go for looping

// 1 java has given a solution for three loops

/*  The Three Loops are.:
 *  For Loop
 *  While loop
 *  Do While loop
 * */

public class LoopingDemo {

	public static void main(String[] args) {
		
		// First Loop is for loop
		// 1.Infinite For loop
		
//		for(;;) {
//			System.out.println("For loop is called..:");
//		}
		
		//finite Loop syntax
		
		//for(initialization;condition;increment or decrement)
		
		// 1. initialization and condition check..and then executes the block
		// 2. decrement / increment  -condition check - execute the block.  run until the condition is true..
		
		int i=1;
		for(;i<=10;) {
			System.out.println("Finite Loop..: "+i);
			i++;
		}
		System.out.println();
		for(int j=10;j>0;--j) {
			System.out.println("Finite reverse.: "+j);
		}
		System.out.println();
		
		//Left side increment and right side decrement. 
		for(int ii=1,j=10;ii<=10 && j>0;++ii,--j) {
			System.out.println(ii+" :"+ j);
		}
		
		
	}
}
