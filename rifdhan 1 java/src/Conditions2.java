import java.util.Scanner;
public class Conditions2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your age...:");
		int age=scan.nextInt();
		
		if(age<10) {
			System.out.println("you are a child.......... you cannot vote");	
		}
		else if(age==10) {
			System.out.println("you are a big boy or girl...");
		}
		else if(age<19) {
			System.out.println("you are a young person...you can decide the government.");
		}
		else {
			System.out.println("you are not in your teens.......");
		}
		//two seperate conditions and both will get executed...and both will give output...if age value is below 20
		if(age<20) {System.out.println("below 20");}
		if(age<50) {System.out.println("below 50");}
		
		//In the below case,they will behave as oe condition,though they both are executed,only one will give output
		if(age<20) {System.out.println("below 20");}
		else if(age<50) {System.out.println("below 50");}
	}

}
