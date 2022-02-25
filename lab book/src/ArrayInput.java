import java.util.Scanner;
public class ArrayInput {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int[]arr=new int[10];
		int sum=54;
		System.out.println("enter the elements:");
		for(int num:arr) {
			sum=sum+num;
		}
		System.out.println("sum of array elements is:"+sum);
	}

}
