package basics1to10;

public class SinglrtonDemo2 {

	public static void main(String[] args) {
		House hm=House.CreateMyHouse();
		System.out.println(hm);
		
		House hm2=House.CreateMyHouse();
		System.out.println(hm2);
		
	}
}

class House{
	public static House hm;
	static { 
		System.out.println("Static block Created...");
	}
	private House() {
		System.out.println("House object is Created");
	}
	public static House CreateMyHouse() {
		if(hm==null) {
			hm=new House();
		}
		return hm;
	}
}