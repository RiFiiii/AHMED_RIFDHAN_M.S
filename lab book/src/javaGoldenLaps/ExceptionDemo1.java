package javaGoldenLaps;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	 
		int a=10,b=0;
		
		int c=0;
		
		try {
			int arr[]=null;
			System.out.println(arr[1]);
			c=a/b;//throw
			System.out.println("try block");
		}
		catch(NullPointerException ne) {
			System.out.println(" NullPointer exception is occurred");
		
		}
		catch(Exception e) {
			System.err.println("error occurred");
		}
		finally {
			System.out.println("this get printed no matter it is");
		}
		System.out.println(c);
		System.out.println("end of progress");
	}

}
