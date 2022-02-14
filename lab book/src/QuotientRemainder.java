public class /QuotientRemainder{
		 public static void main(String[] args) { 
		 int dividend = 25, divisor = 4; 
		 int quotient = dividend / divisor; 
		 int remainder = dividend % divisor; 
		 System.out.println("Quotient = " + quotient); 
		 System.out.println("Remainder = " + remainder); 
		 } 
		} 
		import java.util.Scanner; 
		class OddOrEven 
		{ 
		 public static void main(String args[]) 
		 { 
		 int num; 
		 System.out.println("Enter an Integer number:"); 
		 //The input provided by user is stored in num
		 Scanner input = new Scanner(System.in); 
		 num = input.nextInt(); 
		 /* If number is divisible by 2 then it's an even number
		 * else odd number*/
		if ( num % 2 == 0 ) 
		 System.out.println("Entered number is even"); 
		 else
		 System.out.println("Entered number is odd"); 
		 } 
		}
