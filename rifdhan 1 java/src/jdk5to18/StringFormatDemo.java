package jdk5to18;

public class StringFormatDemo {

	public static void main(String[] args) {
		
		System.out.printf("Integer : %d\n",15);
		System.out.printf("Floating Point number with 3 decimal digits : %.3f\n",1.21312939123);
		System.out.printf("Floating Point number with 8 decimal digits: %.8f\n",1.21312939123);
		
		System.out.printf("String: %s,integer: %06d,float:%.6f","Hello WOrld",89,9.231435);
		
		String s=String.format("String: %s, integer: %d, float: %.6f","Hello World",89,9.231435);
		
		System.out.println("\n"+s);
		
		System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column 3");
	
		System.out.printf("%-12.5s%s","Hello World","World");
	}
}

/* 		Integer formatting
 * 
 * 		%d  : will print the integer as it is.
 * 		%6d : will print the integer as it is.If the number of digits is less than 6,the output will be padded on the left.
 * 		%-6d:will print the integer as it is.If the number of digits is less than 6,the output will be padded on the right.
 * 		%06d : will print the integer as it is.If the number of digits is less than 6,the output will be padded on the left with zeroes.
 * 
 * 
 * 			String formatting
 * %s  : will print the String as it is.
 * %15s : will print the string as it is.If the string has less than 15 characters,the output will be padded on the left.
 * 
 * %.8d : will print maximum 8 character of the string.
 * */
