package assignment;

public class RunningNumberMod7Sum {

	public static void main(String[] args) {
		 
	final	int lowerbound=1;
	final	int upperbound=1000;
		 
		 
		int sum=0;
		
		for(int number=lowerbound;number<=upperbound;number++) {
			if(number%7==0) {
				sum=sum+number;
				 
		}
			System.out.println("the sum 0f "+lowerbound+" to "+upperbound+" is "+sum);
	}
}
}
