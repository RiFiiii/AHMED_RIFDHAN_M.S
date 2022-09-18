package SmartGraduateAssignment;

public class typeCasting {

	public static void main(String[] args) {
		
		byte b=10;
		
		int i=b;// will accept-automatic type promotion
		
		//byte c=i;  //will not accept- because lower type cannot be put in higher
		
		byte d=(byte)i; //Type Castibg Makes it possible to store compatile types
		
		byte x=10;
		
		byte y=20;
		
		//byte sum=x*y;// Error is thrown Because When Two Bytes Are used in Arithmetic Operation,Ths result will be integer
		
		
		int sum=x*y;// this is the right procedure to multiply to byte
		
		System.out.println(sum);
	}

}
