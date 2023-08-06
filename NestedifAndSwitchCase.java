/*
 * trying nested if and switch case statement
 * */



package assignment;

public class NestedifAndSwitchCase {

		public static void main(String[] args) {
			int number=6; // set the value of "number" here !
			
			// using nested-if
			if(number==1) { // use == for comparison
				System.out.println("Apple");
			}else if(number==2) {
				System.out.println("Banana");
			}else if(number==3) {
				System.out.println("cucumber");
			}else if(number==4) {
				System.out.println("Rifiii");
			}else if(number==5) {
				System.out.println("Range");
			}
			
			//using Switch_Case-Default
			
			switch(number) {
			case 1:
				System.out.println("I Ate"); break;
			case 2:
				System.out.println("I Have"); break;
			case 3:
				System.out.println("They Have"); break;
			case 4:
				System.out.println("GAMER"); break;
			case 5:
				System.out.println("ROVER"); break;
				default:
					System.out.println("U does Not Have That Number");
			}
		}
}
