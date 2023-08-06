
/*Compute the sum and average of running integer from a lowerbound to an upperbound using loop*/



package assignment;

public class SumAverageRunnungInt {

	public static void main(String[] args) {
		 int sum=0; // the accumulating sum,init to 0
		 double average;
		 
		final int lowerbound=1;
		final int upperbound=100;
		
		for(int num=lowerbound;num<=upperbound;++num) {
			sum += num;   //same as "sum = sum + number"
		  
		 }
		 
		System.out.println(sum);
		average=sum/upperbound;
		System.out.println(average);
	 
	}
}