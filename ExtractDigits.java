package assignment;

public class ExtractDigits {

	
	public static void main(String[] args) {
		 
		
		 int n=12345;
		 while (n>0) {
			 int digit=n%10;
			 System.out.print(digit);
			 n=n/10;
		 }
		
		
	}
}
