package assignment;

public class ForCondition {

		
		public static void main(String[] args) {
			
			final int lowerbound=111;
			final int upperbound=8899;
			
			double percentage;
			int count=0;
			
			for(int num=lowerbound;num<=upperbound;num++) {
				count=count+num;
				
			}
			System.out.println(count+" This is range " +lowerbound+ " to "+upperbound);
			
			percentage=count/upperbound;
			
			System.out.println(percentage+" This is Percentage " +lowerbound+ " and "+upperbound);
		}
}
