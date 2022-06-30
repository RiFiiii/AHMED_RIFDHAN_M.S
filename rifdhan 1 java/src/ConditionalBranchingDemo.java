
public class ConditionalBranchingDemo {

	public static void main(String[] args) {
		 int n=11;
		 
		 //first way
		 
		 //if conditions always work with booleans
		 
		 //int result=n%2;
		 
		 //if(result==0) {
			 //if(n%2==0);
			 boolean result=(n%2==0);
			 
			 if(result==true) {
				 if(result) {
					 System.out.println("even number.....");
				 }
				 else {
					 System.out.println("odd number...");
				 }
			 }
		 }

	}


