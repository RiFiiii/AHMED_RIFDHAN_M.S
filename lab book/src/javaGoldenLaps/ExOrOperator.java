package javaGoldenLaps;

public class ExOrOperator {

	public static void main(String[] args) {
		 int a=1;
		 int b=2;
		 int c=3;
		 int d=4;
		 //Xor will return true only if the conditions are mutually exclusive.
		 System.out.println(a==1^ b==2);//both the conditions are true
		 
		 System.out.println(c==4^d==3);//both the conditions are false
		 System.out.println(c==4^d==4);//only second condition is true
	}

}
