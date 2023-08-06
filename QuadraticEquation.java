package assignment;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value for x");
		
		int x=sc.nextInt();
		
		int a=5,b=6,c=10;
		
		int ax2=a*(x*x);
		
		int bx=b*x;
		
		System.out.println("Quadratic Equation is: "+(ax2+bx+c));
	}
}

class Quadratic{
	private static Quadratic quad;
	private Quadratic() {
	
	}
		public static Quadratic createnewInstance() { 
			if( quad==null) {
				quad=new Quadratic();
			}
			return quad;
		}
	}
