package advancelabook3;

public class SingleTonPattern {
public static void main(String[] args) {
	

		Singleton obj=Singleton.singletonobjcreate();
		System.out.println(obj);
}
}
class Singleton{
	private static Singleton st;
	private Singleton() {
		System.out.println("Single ton obj  created");
	}
	
	public static Singleton singletonobjcreate() {
	if(st ==null) {
		st=new Singleton();
		return st;
	}else {
		return st;
	}}
}
