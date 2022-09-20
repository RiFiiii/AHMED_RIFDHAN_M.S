package SmartGraduateAssignment;

public class mnc_Day_1 {

	public static void main(String[] args) {
		  
		//type casting
		
		byte b=20;
		
		byte c=90;
		
		
		int z=c*b; // when we do arithmetic operator in byte it automatically convert into int hence this is called type Casting
		
		byte bresult=(byte)(b*c); //both type promotion and demotion is possible only with compatible types
		
		//byte,short,int,long,float,double are compatible types
		
		//boolean - not  compatible with any
		
		//char and int are ccompatible
		
		//string - not compatible with any you cannot cast uncompatible types
		
		boolean boo=true;
		
		// int iboo=(int)boo;  //int and boolean are incompatible types -cannot be casted...
		
		String str="Hello World";
		
		//int istr=(int)str; //string and int are also incompatible types
		
		int x=100;
		
		//str=(String)x;  // incompatible
		
		char ch='a';
		
		char cc=98;
		
		int ic=ch; //a char can be given to int without casting
		
		//ch ci=ic;  // a int cannot be given to char without casting
		
		char ci=(char)ic;
		
		
		// What happen wehn data is incompatible
		
		int n=257;
		byte bn=(byte)258;
		
		//when the data is incompatible then the data is divided by the size of the data type
		
		//it will give you the reminder as the resultant value - so you basically loose the precision
		
		System.out.println(z);
		System.out.println(ch);
		System.out.println(cc);
		System.out.println(n);
		System.out.println(bn);
		

	}

}
