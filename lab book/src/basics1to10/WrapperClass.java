package basics1to10;


/*
 * DataTypes - Primitive / Complex
 * 
 * primitive types - short,byte,int,long,flot,double,char,boolean;  - for better performance  we use primitive types
 * 
 * ComplexTypes - we use complex types when a need arises
 * 
 * */

// Complex means - classses Either System of custom...

//Stack - does not have a memory leakage
//heap - memory leakage i happened...

/*			Wrapper Classes  // Complex type..
 *  It means Wrapper  the primitive types..
 * 
 *     Integer i;
 *     Float f;
 *     Short s;
 *     Byte b;
 *     Long l;
 *     Double d;
 * */

// Out Of Memory Error- when the memory gets filled by objects..

//Stack OverFlow Error- you get when the statck is filled...Every time the program complies the stack get refresh..

// Stack is Temporary  and there is no relationship between performance and statck..
//Heap is Permanent and memory management only perform on heap 


public class WrapperClass {
	
	Integer i;
	Float f;
	Short s;
	Byte b;
	Long l;
	
	Double d;
public static void main(String[] args) {
	
	//Boxing and UnBoxing
	
		//Boxing - wrapper a single type in complex type
		
		//UnBoxing - release a simple type to complex type..
		
	
	
	Integer i=new Integer(20);   // this way of wrapping is deprecated..
	int y=40;
	
	System.out.println(i);
	System.out.println(y);
	
	i=Integer.valueOf(y); // this is new way of wrapperClass.. (Boxing)
	System.out.println(i);
	
	i=Integer.valueOf(y);   // Boxing
	System.out.println(y);
	
	y=i.intValue();  // unboxing
 	System.out.println(y); 
 	
	Float f=67.8f;
	float ff=89.9f;
	System.out.println(f);
	System.out.println(ff);
	
	f=Float.valueOf(ff); //Boxing
	ff=f.floatValue(); // unBoxing
	System.out.println(f);
	System.out.println(ff);
	
	byte b=20;	  //Primitive types
	Byte bb=40;  //Wrapper class
	
	bb=Byte.valueOf(b); //Boxing
	b=bb.byteValue(); // UnBoxing;
	
	long l=76879898l;
	Long ll=85635843l;
	
	System.out.println(l);
	System.out.println(ll);
	
	ll=Long.valueOf(l); //Boxing
	l=ll.longValue(); //unboxing...
	
	System.out.println(l);
	System.out.println(ll);
	
	short s=89;
	Short ss=56;
	
	System.out.println(s);
	System.out.println(ss);
	
	ss=Short.valueOf(s);
	s=ss.shortValue();
	
	System.out.println(s);
	System.out.println(ss);
	
	
	double d=7687.7676d;
	Double dd=65765.878d;
	
	System.out.println(d);
	System.out.println(dd);
	
	dd=Double.valueOf(d);
	d=dd.doubleValue();
	
	System.out.println(dd);
	System.out.println(d);
	
	
	//Boxing and autoBoxing...
	
	d=dd; //autoBoxing
	dd=d; // autoUnBoxing..
	
	// the above logic is only for comparatable type
	//introduced in 2008
	
	b=i.byteValue(); // if we go for mismatch type you have to do like this...
	
	System.out.println(b);
	
}
}
