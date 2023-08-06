package assignment;

public class RunningNumberSquareSum {

		public static void main(String[] args) {
		final	int lowerbound=1;
		final int upperbound=100;
		
		int square=0;
		
		for(int number=lowerbound;number<=upperbound;++number) {
			square=square+number*number;
		}
		System.out.println(square);
		}
}
