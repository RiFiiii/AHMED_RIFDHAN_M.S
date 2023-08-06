package assignment;

public class ConditionDemo {

	public static void main(String[] args) {
		
		// 1. input
		// 2. process
		// 3. output
		
		int n1=10;
		int n2=2;
		
		int result=n1%n2;
		
		// condition using if else method 
		
		/*
		 * if block if you have more than one sysout you must have {} -> 
		 * this Brackets whereas you have only one sysout or simple way one line you doesnt need {} -> this curly Brackets.:
		 * else block you have more than one sysout without curly brackets the second sysout is out of this else block it will run
		 * if else block have this {} -> brackets that second sysout comes under the condition.*/
		
//		if(n1%n2==0) {
//			System.out.println("This is an Even Number..:");
//			System.out.println("Second Line");
//		}else {
//			System.out.println("This is Odd Number..:");
//		System.out.println("Next Line...");
//		}
			
		
		//TernaryOperator -> ? // please understand ternary operator is a question mark
		
		// 1. before this first you have an expression -> what is Expression ?
		/* Expression means logical statement  (result==0) ? "" : "" ;  -> this will return boolean right true or false 
		 * 
		 * 2. if you want to use ternary operator you have to group which means give it in a bracket (result==0) 
		 * 
		 * if the result is true  "left part is for true" : "right part is for false" this : -> means delimter by right part
		 *
		 * 3. please understand in ternary each must have left part and right part..
		 *  4. this will be return for ex: String r= (result==0) ? "" : "" ;   sysout(r);*/
		
//		System.out.println((result==0));  // -> this is boolean this will return logical conclusion   this is a statement
		
//		String r=(result==0)?"left part for true":"right part for false";
//		String r1=(result!=0)?"left part for true":"right part for false";
//		System.out.println(r);
//		System.out.println(r1);
//		
		
		
		//Nested if's
		
		// nested if means i have 2 or 3 conditions  which means -> one inside another
		
//		int day=6;
//		boolean festival=false;
//		
//		if(day==2) {  // day 2 is monday
//			if(festival) {
//				System.out.println("Cant take long leave");
//			}else {
//				System.out.println("no holiday get ready for work");
//			}
//		}else if(day==1) {
//			if(festival) {
//				System.out.println("Holiday Pochi...");
//			}else {
//				System.out.println("leave ila");
//			}
//		}else if(day==6) {
//			if(festival) {
//				System.out.println("jalsa...,Train full");
//			}else {
//				System.out.println("leave ila ooruiku poga mudiyadhu..");
//			}
//		}else {
//			System.out.println("tiffin kattu..,velaiku kalembu");
//		}
		
		// Nested ternary
		
//		int day=2;  boolean festival=true;
//		
//		String res=(day==2)?(festival)?"cant take long holiday":"go for one day leave":"go to work";
//		System.out.println(res);
		
		String str="Hello";  // String is non mutable.
		
		//
		
		System.out.println(str.charAt(0)); //this is one type of method charAt(); indicate the word which is located at give index number
		System.out.println(str.endsWith("o")); //this method type return true or false 
		
		System.out.println(str.substring(1)); //It reads the input of the given index
		System.out.println(str.substring(1, 3)); //It read the index of start at 1 and ends with 3 which means 3-1(n-1) =2 
		
		System.out.println(str.concat(" ")); // this will print one space at the end
		 
		String str2=str.concat(" ");
		
		System.out.println(str2.substring(1, 6));
		
		String temp=str;
		
		str=str.concat(" World");
		
		System.out.println(temp);
		
		System.out.println(str);
		
		
		// if you want to compare String Never Ever Use == Operator for comparing string
		
		// WE Have A Method Called 'Equals'
		String name="rakesh";
		String name2="rakesh";
		System.out.println(name.equals(name2));
		
		// Here We Have A another Method Called 'CompareTo'  It Returns '+ Value' or '- Value' or zero
		
		String x="a"; // 97  here (a-b) is Happening (97-98) = -1 //Hence Proved
		String y="b"; //98 
		
		System.out.println(x.compareTo(y));
		
		// This Compare Method is Used in sorting ascending order descending order this method is used
		
		String name3="Rifdhan";
		String name4="rifdhan";
		
		System.out.println(name3.equalsIgnoreCase(name4)); // This Method is Ignore CaseSensitive...so name is equal it Doesn't care about caseSensitivity
		
		//From jdk 5 we can use string in switch case.
		
		String day1="monday";
		String day2="tuesday";
		String day3="wednesday";
		
		switch(day3) {
		case "monday":{
			System.out.println("this is monday");
			break;
		}
		case "tuesday":{
			System.out.println("This is tuesday.:");
			break;
		}
		case "wednesday":{
			System.out.println("This is wednesday.:");
			break;
		}default:{
			System.out.println("Default..:");
		}
		}
		
		
	}
}
