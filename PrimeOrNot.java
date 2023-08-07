package assignment2;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num=0;		
		String primenumber="";
		
		 
		for(int i=1;i<=200;i++) {
			int counter=0;
			
			for(num=i;num>=1;num--) {
			
				if(i%num==0) {
				counter =counter +1;
			}
			}
			if(counter==2) {
				primenumber=primenumber+i+" ";
			}
		}
			System.out.println("Prime Number from 1 to 200 are :");
			System.out.println(primenumber);
		}
	}

