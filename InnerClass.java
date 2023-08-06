package assignment;

// why inner class? -> to achieve encapsulation
//A class within an class is called inner class.
//two types - normal inner class / static inner class

public class InnerClass {

	
	public static void main(String[] args) {
		Outer.MyInner omi=new Outer().new MyInner(); //syntax of creating inner class object
		
		Outer.MyInnerStatic omis=new Outer.MyInnerStatic();
	}
}
 
 //we are going for inner class for better encapsulation

	//Rules
// outer class variables can be accessed by the inner class
//non static inner classes can access both static and non static variables and methods.
//static inner class and static methods can only access static variables and methods
//static - static methods cannot use this keyword


class Outer{
	int i;
	static int j;
	
	class MyInner{
		public MyInner() {
			hai();
			System.out.println("MyInner cons called..."+i+":"+j);
			
			//outer class variables can be accessed by the inner class
		}
		public void met() {
			hai();
		}
	}
	public void hai() {
		System.out.println("hai called...");
	}
	public static void jai(MyInnerStatic my) {
		System.out.println("Jai Called...");
	}
	static class MyInnerStatic{
		//outer class non static variables and methods cannot be accessed by static inner class
		public MyInnerStatic() {
			met(this);
			System.out.println("myinner static cons called..."+j+":");
		}
		public static void met(MyInnerStatic my) {
			jai(my);
		}
	}
}