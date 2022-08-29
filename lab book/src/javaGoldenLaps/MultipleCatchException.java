package javaGoldenLaps;

public class MultipleCatchException {

	public static void main(String[] args) {
		try {
		 int l=0;
		 System.out.println("l="+l);
		 int b=42/l;
		int arr[]= {1};
		 arr[22]=99;
		}
		 catch(ArrayIndexOutOfBoundsException e)
			{
			 System.out.println("DIVIDED BY 0:"+e);
			 }
		 catch(Exception e)
			{
			 System.out.println("array index oob:"+e);
			}
		System.out.println("after try/catch blocks");
	}
	}
