package assignment;

public class Factorial12 {

	
	public static void main(String[] args) {
		
		
		final long min=1l;
		final long max=12l;
		
		long product = 1l;
		
		for(long i=min;i<=max;++i) {
			
			product*=i;
		}
		System.out.println(product);
	}
}
