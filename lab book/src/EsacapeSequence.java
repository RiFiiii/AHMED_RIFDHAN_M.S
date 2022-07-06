
public class EsacapeSequence {

	public static void main(String[] args) {
		 System.out.println("hello\"eve\"world");
		 
		 System.out.println("hello\'eve\'world");
		 
		 System.out.println("hello\neve\nworld");
		 
		 System.out.println("hello\feve\fworld");//form feed - page break
		 
		 System.out.println("hello \b\b\b world");
		 
		 System.out.println("HellohelloHello\rworld");
		 
		 int count=0;
		 
		 while(true) {
			 System.out.println(count++ +"\r");
			 count++;
		 }

	}

}
