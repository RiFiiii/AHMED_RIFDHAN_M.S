package assignment;

public class OddEvenSum {

	
		public static void main(String[] args) {
			final int lowerbound=1;
			final int upperbound=1000;
			
			int sumOdd=0; //for accumulating odd numbers,init to 0
			int sumEven=0; //for accumulating even number,init to 0
			
			for(int number=lowerbound;number<=upperbound;++number) {
				if(number%2==0) {
					sumEven+=number;
				}else {
					sumOdd+=number;
				}
				 
			}
			System.out.println("The Sum Of Odd Number from"+lowerbound+" to "+upperbound+" is "+sumOdd);
			System.out.println("The Sum Of Odd Number from"+lowerbound+" to "+upperbound+" is "+sumEven);
			
			System.out.println("The Difference Between SumOdd And SumEven"+(sumOdd-sumEven));
		}
}
