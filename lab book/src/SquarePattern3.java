import java.util.Scanner;

public class SquarePattern3 {

	
	public static void main(String[] args) {
		
//		int row;
//		int col;
		int size;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size.:");
		size=s.nextInt();
		for(int row=0;row<=size;row++) {
			for(int col=1;col+row<=size+1;col++) {
				System.out.print(" # ");
			}
			System.out.println();
		}
	}
}
