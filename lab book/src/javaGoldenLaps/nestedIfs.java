package javaGoldenLaps;

public class nestedIfs {
	public static void main(String[] args) {
		
		//declaring double type variables
		double n1 =-1.0,n2 =4.5,n3=-7.9,largest;
		
		//checks if n1 is greater than or equal to n2
		if(n1>=n2) {
			//if...else statement inside the if block
			//checks if n1 is greater than or equal to n3
			if(n1>=n3) {
				largest = n1;
			}
		else {
			largest = n3;
		}
	}else {
		//if..else statement inside else block
		//check if n2 is greater than or equal to n3
		if(n2>=n3) {
			largest = n2;
		}
		else {
			largest =n3;
		}
	}
		System.out.println("Largest Number:"+largest);
	}
}

