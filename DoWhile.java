package assignment;

public class DoWhile {
 
	public static void main(String[] args) {
		
		int lowerbound=111;
		int upperbound=8899;
		
		int sum=0;
		double average;
		
		int number=lowerbound;
		do {
			sum +=number;
			number++;
		}while(number<=upperbound);
		System.out.println(sum);
		average=sum/upperbound;
		System.out.println(average);
	}
}
