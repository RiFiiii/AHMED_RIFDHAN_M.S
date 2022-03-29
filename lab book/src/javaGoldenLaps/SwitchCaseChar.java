package javaGoldenLaps;
import java.util.Scanner;
public class SwitchCaseChar {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("please enter a char...:");
		char c=Scan.next().charAt(0);
		
		System.out.println("/n character switch.......");
		switch(c) {
		case 'b':{
			System.out.println("b called....:"+c);
			break;
		}
		case 'c':{
			System.out.println("a called....:"+c);
			break;
		}
		default:{
			System.out.println("default of char called....:"+c);
		}
		}
	}

}
