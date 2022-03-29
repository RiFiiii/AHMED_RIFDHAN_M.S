package javaGoldenLaps;
import java.util.Scanner;
public class SwitchCaseString {

	public static void main(String[] args) {
	 Scanner Scan=new Scanner(System.in);
	 System.out.println("please enter a string..:");
	 String s=Scan.next();
	 //a switch case can work on int char string (jdk5) and enum (jdk5)
	 switch(s) {
	 case "hai":{
		 System.out.println("hai value....."+s);
		 break;
	 }
	 case "hello":{
		 System.out.println("hello value...."+s);
		 break;
	 }
	 default:{
		 System.out.println("default of string switch."+s);
	 }
	 }

	}

}
