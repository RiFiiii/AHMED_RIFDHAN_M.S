import java.util.Scanner;
public class FloydsTriangle {

	public static void main(String[] args) {
		int rows,number=1,counter,j;
		//to get the user's input
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows for floyds triangle:");
		//copying user input into an integer variable named rows
		rows=input.nextInt();
		System.out.println("Floyds triangle");
		System.out.println("************");
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.println(number+"");
				//incrementing the number value
				number++;
			}
			//for new line
			System.out.println();
		}
	}
}
