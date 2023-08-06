package assignment;

public class Factorial11 {

	
	public static void main(String[] args) {
		
		long min=1l;
		long max=11l;
		
		long product=1l;
		
		for(long i=min;i<=max;i++) {
			product*=i;
		}
		System.out.println(product);
	}
}
