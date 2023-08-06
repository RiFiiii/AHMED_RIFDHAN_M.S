package assignment;

import java.util.Scanner;

public class TribonacciSeries {

	
	public static void main(String[] args) { //condition t(n) = t(n-1)+t(n-2)+t(n-3)
		
											//2nd condition t(1)=t(2)=1 and t(3)=2
		
		 int tn;
		 int tnminus1=0;
		 int tnminus2=1;
		 int tnminus3=1;
		 int nmax=20;
		 
		 
		 System.out.println("The tribonacci series"+nmax+" first 20 is.");
		 
		 int i=0;
		 
		 while(i<=nmax) {
			 System.out.println(tnminus1+ " ");
			 tn=tnminus1+tnminus2+tnminus3;
			 tnminus1=tnminus2;
			 tnminus2=tnminus3;
			 tnminus3=tn;
			 i++;
		 }
		 
	}
	
}
