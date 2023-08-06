package advancelabook3;

public class SingletonPattern3 {

	public static void main(String[] args) {
		Singleton4 obj=Singleton4.createinstance();
		System.out.println(obj);
		Singleton4 obj2=Singleton4.createinstance();
		System.out.println(obj2);
		Singleton4 obj3=Singleton4.createinstance();
		System.out.println(obj3);
		Singleton4 obj4=Singleton4.createinstance();
		System.out.println(obj4);
		Singleton4 obj5=Singleton4.createinstance();
		System.out.println(obj5);
	}
}

		// static methods can onl access static variable
	
	// static methods cannot access non static variable

class Singleton4{
	private static Singleton4 st;
	private Singleton4() {
		System.out.println("Obj Created");
	}
	
	
	public static Singleton4 createinstance() {
		
		if(st==null) {
			st=new Singleton4();
			return st;
		}
		else {
			return st;
		}
	}
}