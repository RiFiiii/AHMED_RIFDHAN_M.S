package assignment;

public class Factorial13 {

	
	public static void main(String[] args) {
		final long lowerbound=1l;
		final long upperbound=13l;
		
		long product=1l;
		

		for(long i=lowerbound;i<=upperbound;i++) {
//			  product=((i-1)*i);
		product*=i;
		

			
			  
			
		}
		System.out.println(product);
	}
}
