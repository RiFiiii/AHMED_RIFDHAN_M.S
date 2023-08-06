package assignment;

public class ComputePi2 {

	
	public static void main(String[] args) {
		
		double sum=0.0;
		
		int Max_Denominator=1000;
		
		for(int denominator=1;denominator<=Max_Denominator;denominator+=2) { //denominator =denominator+2
			
			if(denominator%4==1) {
				sum+=1d/denominator;
				 
			}else if(denominator%4==3){
				sum-=1d/denominator;
			}else { //remainder of 0 or 2
				System.out.println("Impossible");
			}
		}
		
		System.out.println(sum*4);
		System.out.println(Math.PI);
		double average=((sum*4)*Math.PI)/100;
		System.out.println("Average..:"+average);
	}}
