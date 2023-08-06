package assignment;

public class RunningNumberSum {

	
		public static void main(String[] args) {
			
		final	int lowerbound=1;
		final	int upperbound=1000;
		
		int sum=0;
		
		int number=lowerbound;
		while(number<=upperbound) {
			
			sum=sum+number;
			++number;
		}
		System.out.println("The sum from"+lowerbound+" to "+upperbound+" is "+sum);
		}
}
