package assignment;

public class Factorial14 {

	
	public static void main(String[] args) {
		
		final long lowerbound=1l;
		final long upperbound=14l;
		
	    long product=1l;
	    
	    for(long i=lowerbound;i<=upperbound;i++) {
	    	product*=i;
	    }
	    System.out.println(product);
	}
}
