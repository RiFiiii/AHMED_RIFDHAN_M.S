package inheritance;

public class ShortCircuitAndOperator {

	public static void main(String[] args) {
		 int hour =10;
		 int minute=30;
		 //short circuit and operator is different from
		 //normal And Operator.If happens like this that
		 //the when first condition is checked and if it
		 //is true then only it checks for the second condition
		 //that is on the other side of the &&
		 if(hour == gethour() && minute == getminute()) {
			 System.out.println("It is 10:30");
		 }

	}
public static int gethour() {
	System.out.println("return hour");
	return 10;
}
public static int getminute() {
	System.out.println("return minute");
	return 30;
}
}