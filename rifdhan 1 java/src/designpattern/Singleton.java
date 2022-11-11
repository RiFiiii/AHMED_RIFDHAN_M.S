package designpattern;


// objective - to ensure that the object creation of particular class is

//restricted to only one object

//Advantage - multiple objects of certain classes could be problem,so we dont allow
// to create multiple object


//static methods can only access static variables and methods
public class Singleton {

	public static void main(String[] args) {
		
	}
}

class Resource{
	private static Resource obj;
	static {
		System.out.println("Static block can be called for initialization");
	}
	private Resource() {
		System.out.println("Resource object created..");
	}
	
	public static Resource createSingleTonInstance() {
		if(obj==null) {
			obj=new Resource();
		}
		return obj;
	}
}