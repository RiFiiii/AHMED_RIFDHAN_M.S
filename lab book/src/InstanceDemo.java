
public class InstanceDemo {

	
	public static void main(String[] args) {
		xyz obj=new xyz();
		xyz obj2=new xyz();
		
//		obj.y=60;
//		obj2.y=100;
		
		obj.x=80;
		obj2.x=98;
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		System.out.println(obj2.x);
		System.out.println(obj2.y);
	}
}

class xyz{
	int x=10;
	static int y=30;
}