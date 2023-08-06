package assignment;

public class ModifyTheProgramsSumOfTheSquares {

	 
	 public static void main(String[] args) {
		final int lowerbound=1;
		final int upperbound=100;
		
		 
		int sum=0;
		
		for(int num=lowerbound;num<=upperbound;++num) {
			 sum= sum+num*num;
			
			 
		}
		System.out.println(sum);
	}
}
