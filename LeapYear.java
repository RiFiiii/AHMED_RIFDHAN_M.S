package assignment;

public class LeapYear {

	public static void main(String[] args) {
		int lowerbound=999;
		int upperbound=2010;
		
		int leapYear=0;
		int notLeapYear=0;
		
		for(int count=lowerbound;count<=upperbound;count++) {
			if(count%4==0) {
				System.out.println("this is a Leap Year "+count);
				leapYear+=1;
			}else {
				System.out.println("this is not a leap year "+ count);
				notLeapYear+=1;
			}
		}
		System.out.println("this is total number Of leap year "+leapYear);
	    System.out.println("this is total number of NotLeapYear "+notLeapYear);
	}
	
}
