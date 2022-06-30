package javaGoldenLaps;

public class ContinueDemo {

	public static void main(String[] args) {
		 int i=0;
		 
		 while(i<10) {
			 ++i;
			 if(i%3==0) {
				 continue;//it means i am telling to jump to the loop once again
			 }
			 System.out.println(i);
		 }

	}

}
