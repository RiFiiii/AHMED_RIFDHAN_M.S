package assignment;

public class RunningNumberOddSum {

	
		public static void main(String[] args) {
			
		final int lowerbound=1;
		final int upperbound=1000;
		
		int sum=0;
		
		 
		 
		
		for(int number=lowerbound;number<=upperbound;++number ) { 
			if(number%2==1) {
			sum=sum+number;
			++number;
			
		}
		System.out.println("The Sum From "+lowerbound+" to "+upperbound+" is "+sum);
		
		}
}
}