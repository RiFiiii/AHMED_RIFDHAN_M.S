package assignment;

public class WhileDoLoop {
	
	public static void main(String[] args) {
		int sum=0;
		final int lowerbound=1;
		final int upperbound= 100;
		double average;
		
		int number=lowerbound; //declared and init loop index variable
		
		while(number<=upperbound) { //test
			sum += number;
			number++;  //update
			//System.out.println(sum);  //if you wanteach value run inside loop otherwise run outside a loop
			 
		}
		System.out.println("The Total Sum is "+sum); 
		average=sum/upperbound;
		System.out.println("The Total Percentage "+ average);
		
	}
}
