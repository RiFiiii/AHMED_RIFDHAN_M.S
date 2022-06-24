package javaGoldenLaps;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	 
		int a=10,b=0;
		
		int c=0;
		
		try {
			c=a/b;//throw
		}
		catch(Exception e) {
			System.err.println("error occurred");
		}
		System.out.println(c);
		System.out.println("end of progress");
	}

}
