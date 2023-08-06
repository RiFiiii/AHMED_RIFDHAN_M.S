package assignment;

public class RunningNumberSum1 {

	
		public static void main(String[] args) {
			 
			final int lowerbound=9;
			
			final int upperbound=899;
			
			int sum=0;
			
			int number=lowerbound;
			
			while(number<=upperbound) {
				
				sum=sum+number;
				
				++number;
			}
			System.out.println("The Sum From"+lowerbound+" to "+upperbound+" is "+sum);
		}
}
