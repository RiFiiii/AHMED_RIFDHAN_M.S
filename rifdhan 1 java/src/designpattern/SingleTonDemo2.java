package designpattern;

public class SingleTonDemo2 {
	public static void main(String[] args) {
		ResourceR obj=ResourceR.CreateSingleTonInstance();
		System.out.println(obj);
		
		ResourceR obj2=ResourceR.CreateSingleTonInstance();
		System.out.println(obj2);
	}
}

class ResourceR{
	private static ResourceR obj;
	private ResourceR() {
		System.out.println("Resource object is created...");
	}
	public static ResourceR CreateSingleTonInstance() {
		if(obj==null) {
			obj=new ResourceR();
		}
			return obj;
	}
}
