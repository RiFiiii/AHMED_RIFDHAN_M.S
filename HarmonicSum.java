package assignment;

public class HarmonicSum {

	
	public static void main(String[] args) {
		final int MAX_DOMINATOR=50000;
		
		double sumL2R=0.0;
		double sumR2L=0.0;
		double absDiff;     
		
		for(int denominator=1;denominator<=MAX_DOMINATOR;++denominator) {
			 
			sumL2R+=(double) 1d/denominator;
			}
		System.out.println(sumL2R);
		
		
		for(int denominator=MAX_DOMINATOR;denominator>=1;denominator--) {
			sumR2L+=(double) 1d/denominator;
		}
		 System.out.println(sumR2L);
		 
		 if(sumL2R>sumR2L) {
		 absDiff=sumL2R-sumR2L;
		 System.out.println("The absDiff of Left to Right"+sumL2R);
		 }else {
			 absDiff=sumR2L-sumL2R;
			 System.out.println("the absDiff of right to left"+sumR2L);
		 }
		
		 
		
	}
}
