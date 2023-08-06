package assignment;

public class nestedIfSwitchDays {

	public static void main(String[] args) {
		int day=7; // day=(0,1,2,3,4,5,6) each number depends on each character..
		
		if(day==0) {
			System.out.println("sunday ");
		}else if(day==1) {
			System.out.println("Monday ");
		}else if(day==2){
			System.out.println("Tuesday ");
		}else if(day==3) {
			System.out.println("wednesday ");
		}else if(day==4) {
			System.out.println("Thursday ");
		}else if(day==5) {
			System.out.println("friday ");
		}else if(day==6) {
			System.out.println("Saturay ");
		}else {
			System.out.println("YOU HAVE ENTERED INVALID DAY PLEASE ENTER A VALID DAY");
		}
			//switchCase
			
			switch(day) {
			case 0:
				System.out.println(" today is a holiday "); break;
			case 1:
				System.out.println(" today is a Working day"); break;
			case 2:
				System.out.println(" today is a Working day"); break;
			case 3:
				System.out.println(" today is a Working day"); break;
			case 4:
				System.out.println(" today is a Working day"); break;
			case 5:
				System.out.println(" today is a Working day"); break;
			case 6:
				System.out.println(" today is a Working day /  Today is holiday Based on college rules"); break;
				default:
					System.out.println("PLEASE ENTER A VALID DAY");
			}
		
		}
		
	}
	
