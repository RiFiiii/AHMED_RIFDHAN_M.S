package javaGoldenLaps;

public class typecastingdemo {

	public static void main(String[] args) {
		//  there are three types  1.compatible  2.incompatible  3.auto type promotion
		
		
	//java is a strongly typed language
		
		boolean b=true;
		
		//int n=b; //incompatible type
		
		boolean c=b;//compatible type
		
		int n=259; //32 bit whereas byte is 8 bit  //here 259-256 = 3.
		
		byte bb= (byte) n;//type casting converting integer to number
		
		System.out.println(bb);//the number 259 is divided by 256 and the remainder is presented
		
		//when you down cast  a higher into a lower data type-the precision of the data will be lost
		
		n=bb;//lower type can automatically to higher type-auto type promotion
		
		byte n1=10;
		byte n2=2;
		
		//acceptable int result=n1*n2;//the result of arithmetic operator will be always a int
		
		byte result=(byte) (n1*n2);//here we use typecasting //when two byte values are multiplied the result is autopromoted to int type
		
		char cc=97;
		cc='a';
		
		int num=97;
		//cc=num   //all numbers cannot be character-and more over num is 32bit and char is 16bit
			
		num=cc;//character can be asssigned to number because all characters are numbers
				

	}

}
