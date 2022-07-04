
public class Short_CircuitOr {

	public static void main(String[] args) {
		 
		int hour=10;
		int minute=30;
		//if the first condition is true then it will not
		//check for the second condition.but if the first
		//condition is false then it will check for second
		//condition.Incase of OR either one of the conditions should be true.
		if(hour == gethour()||minute == getminute()){
			System.out.println("correct time of display this message");
		}

	}
public static int gethour() {
	System.out.println("returning hour");
	return 10;
}
public static int getminute() {
	System.out.println("returning minute");
	return 30;
}
}
