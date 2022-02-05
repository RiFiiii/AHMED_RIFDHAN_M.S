cannot convert from int to byte
public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		int i=b;//will accept-automatic type promotion
		byte c=i;//will not accept-because lower typr cannot to be put in heigher
		byte d=(byte)i;//type casting makes it possible to store compatible types.
		byte x=10;
		byte y=20;
		byte sum=x*y;//error is thrown because when two bytes are used in a arthmetic operation,the result will be interger

	}

}
