package assignment2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTon {

	public static void main(String[] args) {
//	System.out.println(	Str.createInstance());
//	System.out.println(	Str.createInstance());
	
	ExecutorService es=Executors.newFixedThreadPool(2);
	
	es.execute(()->{System.out.println( Str.createInstance());}); // interface () -> {}; 
	
	es.execute(()->{System.out.println( Str.createInstance());});
	
	// synchronized is to solve double dip problem
	// 1.anonymous 2.method referencing 3. lambda 4.
	}
}

class Str{
	public static Str st;
	
	private Str() {
	System.out.println();
	}
	
 synchronized public static Str createInstance() { //method lock
		if(st==null) {
			st=new Str(); 
		}
		return st;
	}
	
}