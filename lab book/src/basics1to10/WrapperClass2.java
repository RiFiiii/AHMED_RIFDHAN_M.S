package basics1to10;

public class WrapperClass2 {

	public static void main(String[] args) {
		
		int x=100;
		
		Integer xx=300; //this was not allowed before jdk5
		
		//After jdk5 autoBoxing and AutoUnboxing is Created..
		
		Integer xxx=new Integer(x); //this is deprecated this is no longer bad practice
		Integer xxxx=Integer.valueOf(x); //Boxing 
		System.out.println(xxxx);
		
		x=Integer.valueOf(xx);
		System.out.println(xxxx);
		xx=x;  //this was not  allowed before jdk5
		// But after jdk5AutoUnboxing was Created...
		System.out.println(xx);
		
		x=xx.intValue(); //auto unboxing
          
		// These are properties without parenthesis is properties with parenthesis that are methods
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Integer.compare(100, 20));  
		
		System.out.println(Float.max(5653.3f, 574378.46f));
		
		String str="567";
		String str2="678";
		
		System.out.println(str+str2); // this will return concatenation
		
		System.out.println(Integer.parseInt(str)+Integer.parseInt(str2));  // Integer.parseInt method is return addition..
		
//		byte b=xx; //auto unboxing is not work for other data types..
		
//		There Are Two Advantages of Wrapper Classes 1.where simple types are not acceptable,there we can pass complex types..
		//the richset of methods are available in the wrapper classes...
		
	}
}
