package inheritance;

public class SumOfArrayValues {

	public static void main(String[] args) {
		 int[]array = {10,20,30,40,50,90};
		 int sum=0;
		 //advance for loop
		 for(int num:array) {
			 sum=sum+num;
		 }
		 System.out.println("sum of array elements is:"+sum);
	}

}
