package assignment;

public class TerminatingCondition {

	
	public static void main(String[] args) {
		
			final int MAX_TERM=10000; //number of terms used in computation
			
			double sum=0.0;
			
			for(int term=1; term<=MAX_TERM;++term) {
				//term
				
				if (term %2==1) {
					sum+=1.0/(term*2-1);
				}
				else {
					sum-=1.0/(term*2-1); 
					}
				}
					System.out.println(sum);
			}
	}

