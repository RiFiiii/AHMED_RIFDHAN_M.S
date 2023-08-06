package advancelabook3;

public class ExDemo1 {
	public static void main(String[] args) {
		
		System.out.println("Before Exception..");
		
		try {
			int i=5/0;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aee){
			aee.printStackTrace();
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
		}
		finally {
			System.out.println("I am Finally block..");
		}
		System.out.println("After Exception");
	}

}

// the above is a classic example of unchecked exception.the try-catch block 
// Actually saves the code from crashing,if u remove the try-catch block
// then the string "After Exception" will never get printed.

// so primarily try-catch handles the exception so that the code does not crash.

//but in reality,you should avoid unchecked exception,you should ensure that the code never encounters
// A Exception so the right way of handling  the above scenario is not try-catch but avoiding the exception.find below the right code.
