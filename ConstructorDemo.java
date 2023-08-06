package advancelabook3;

public class ConstructorDemo {

	public static void main(String[] args) {
//		Shoe s=new Shoe(10);
		
		Shoe s=new Shoe(20,"Rifdhan");
		
//		Mobile mb=new Mobile(70000);
		
		Mobile mb=new Mobile(70000,12);
	}
}

class Shoe{
	public Shoe(int i) {  // constructor created
		System.out.println("Cons Called");
	}
	public Shoe(int j,String s) { // this is overloading of constructor
		System.out.println("Cons2 Called");
	}
	
}

class Mobile{
	public Mobile(int mobileonly) {
		System.out.println("mobile with 1 yrr warranty");
	}
	public Mobile(int mobile,int Warranty) {
		System.out.println("mobile with extra 1 yr warranty");
	}
}