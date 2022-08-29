package inheritance;

public class ControlStatementsDemo1 {
//Here We see How break and continue works
	public static void main(String[] args) {
		 a:{
			 for(int i=0;i<10;i++) {
				b:{System.out.println(i);
				break a;
				//sysout(i);//here we use for loop using break statement for better understanding
				}
			 }
			 for(int i=0;i<10;i++) {
				 if(i%2==0) {
					 continue;
				 }
				 System.out.println(i+":");
			 }
		 }

	}

}
