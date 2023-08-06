package assignment;

import java.util.Scanner;

public class PhoneKeyPad {

	public static void main(String[] args) {

		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String..:");
		str=sc.next().toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char cc=str.charAt(i);
			switch(cc) {
			case 'a': case 'b': case 'c':
				System.out.print(2);
				break;
				
			case 'd': case 'e': case 'f':
				System.out.print(3);
				break;
				
			case 'g': case 'h': case 'i':
				System.out.print(4);
				break;
				
			case 'j': case 'k': case 'l':
				System.out.print(5);
				break;
				
			case 'm': case 'n': case 'o':
				System.out.print(6);
				break;
				
			case 'p': case 'q': case 'r':
				System.out.print(7);
				break;
				
			case 's': case 't': case 'v':
				System.out.print(8);
				break;
				
			case 'u': case 'x': case 'y': case 'z':
				System.out.print(9);
				break;
			default:
				System.out.println("null");
			}
			
			}
		}

	}

