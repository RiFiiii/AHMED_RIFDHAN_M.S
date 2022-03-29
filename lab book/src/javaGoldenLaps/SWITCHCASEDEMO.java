package javaGoldenLaps;
import java.util.Scanner;
public class SWITCHCASEDEMO {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("print enter a int..:");
		int i=Scan.nextInt();
		
		//a switch case works on int,char,string(frpm jdk5)and (jdk5)
		System.out.println("/n..switch case for int called...............");
		switch(i) {
		default:{
			System.out.println("default called...."+i);
			break;
		}
		case 1:{
			System.out.println("value of the int is 1..."+i);
			break;
		}
		case 2:{
			System.out.println("value of the int is 2..."+i);
			break;
		}
		case 3:{
			System.out.println("value of the int is 3..."+i);
			break;
		}

	}
	}
}
