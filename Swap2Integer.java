package assignment;

public class Swap2Integer {

	
	public static void main(String[] args) {
		
		int fstnum=9;
		
		int sndnum=-9;
		
		int temp;
		
		System.out.println("Before swap first number..:  "+fstnum);
		System.out.println("Before swap second number..:  "+sndnum);
		
		//After Swap
		temp=fstnum;
		 fstnum=sndnum;
		 sndnum=temp;
		System.out.println("After swap first number..: "+fstnum);
		System.out.println("After swap second number..: "+sndnum);
	}
}
