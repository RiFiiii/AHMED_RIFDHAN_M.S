package assignment;

import java.util.Scanner;

public class ExchangeCipher {

	public static void main(String[] args) {
		String str;
		char cc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Ciper Value.:");
		str=sc.next().toUpperCase();
		System.out.println("The CiperText string is..:");
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			if(c=='A') {
				cc='Z';
			}else if(c=='B') {
				cc='Y';
			}else if(c=='C') {
				cc='X';
			}else if(c=='Z') {
				cc='A';
			}else if(c=='Y') {
				cc='B';
			}else if(c=='X') {
				cc='C';
		}
			System.out.print(cc);	
	}
		
}}
