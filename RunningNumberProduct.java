package assignment;

public class RunningNumberProduct {

		public static void main(String[] args) {
			
		final int lowerbound=1;
		final int upperbound=10;
		
		int product=1;
		
		for(int number=lowerbound;number<=upperbound;number++) {
			product=product*number;
}
		System.out.println(product);
		 
}
}