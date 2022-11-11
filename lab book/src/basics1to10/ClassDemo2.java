package basics1to10;

public class ClassDemo2 {

	public static void main(String[] args) {
		
		Test obj=new Test(); // this is how we create a object of a class
		
		obj.met(); // fire and forget
		obj.met2();
		int result=obj.met3();// fire and expect
		
		System.out.println(result);
	}
}

class Test{
	//primitive types or simple types
	
	int i; // variables declared outside the methods are called instance variables-denotes state
	
	void met() {
		// - denotes behaviour
		// Instance Variables are initialized by default but local variables are not initialized by default
		
		int meti=1032;//local variable
		
		System.out.println(i);
		System.out.println(meti);
	}
	void met2() {
		System.out.println(i);
	}
	int met3() {
		return 100;
	}
}