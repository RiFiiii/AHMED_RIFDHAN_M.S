package javaGoldenLaps;

public class VariableDemo2Revision {

	public static void main(String[] args) {
		 //byte - byte,short - short etc
		
		Integer i=20;
		i=new Integer(20);
		i=Integer.valueOf(20);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.min(10,20));
		
		System.out.println(Integer.max(10,20));
		
		String num1="100";
		String num2="200";
		
		System.out.println(num1+num2);//here we use string concatination
		
		int n1=Integer.parseInt(num1);//parseInt method of Integer is Actually Converting String to number
		int n2=Integer.parseInt(num2);
		
		System.out.println(num1+num2);
		
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
	}

}
