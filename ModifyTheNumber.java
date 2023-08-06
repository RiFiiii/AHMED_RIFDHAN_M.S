package assignment;

public class ModifyTheNumber {

	
	public static void main(String[] args) {
		 
		final int lowerNumber=1;
		final int BiggerNumber=100;
		
		int sumOdd=0;
		int sumEven=0;
		int absdiff;
		
		for (int number=lowerNumber;number<=BiggerNumber;number++) {
			if(number%2==0) {
				sumEven += number;
			}else {
				sumOdd += number;
			}
		}
		System.out.println("This is a Even number..:"+sumEven);
		System.out.println("This is a odd number..:"+sumOdd);
		
		//compute abs diff
		
//		if(sumOdd > sumEven) {
//			absdiff= sumOdd-sumEven;
//		}else {
//			absdiff=sumEven-sumOdd;
		absdiff=(sumOdd > sumEven)?sumOdd - sumEven:sumEven - sumOdd;
		System.out.println("This is absolute difference "+absdiff);
		}
		 
	}

