package assignment;

public class ThreeFiveSevenSum {
	
	public static void main(String[] args) {
		
		final int lowerbound=1;
		final int upperbound=1000;
		
		int sum=0;
		
		for(int i=lowerbound;i<=upperbound;++i) {
			if((i%3==0) && (i%5==0 || i%7==0)) {
				sum+=i;
				System.out.println("ThreeFiveSeven "+i);
			}else if((i%15!=0)&&(i%21!=0)&&(i%35!=0 || i%105==0)){
				sum+=i;
				System.out.println("15,21,35 or 105 avoided "+i);
			}
		}
	}

}
