package assignment2;

import java.util.Scanner;

public class CheckPrime {

	
	public static void main(String[] args) {
		
		int i=0;
		int num;
		int count=0;
		
		Scanner s=new Scanner(System.in);
		
		String primeOrNot="";
		
		boolean isValid=true;
		 
		do {
		for(i=1;i<=200;i++) {
			isValid=true;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
			if(count==2) {
				primeOrNot=primeOrNot+i+"";
				System.out.println("Prime numbers are..:");
				System.out.println(primeOrNot);
				isValid=true;
			}else {
				System.out.println("This Is Not a Prime Number..:");
				isValid=false;
			}
		}
		
		
	}while (!isValid);
	}
}
