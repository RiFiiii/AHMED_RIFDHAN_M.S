package basics1to10;

public class SingleTon {

	public static void main(String[] args) {
		Resource obj=Resource.CreateInstanceSingleTon();
		System.out.println(obj);
		
		Resource obj2=Resource.CreateInstanceSingleTon();
		System.out.println(obj2);
	}
}

class Resource{
	private static Resource obj;
	static {
		System.out.println("Static Block is ");
	}
	private Resource() {
		System.out.println("Resource Obj Created");
	}
	public static Resource CreateInstanceSingleTon(){
		if(obj==null) {
			obj=new Resource();
		}
		return obj;
	}
}
