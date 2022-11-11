package basics1to10;

public class ProtoType {

	public static void main(String[] args) throws Exception{
		Fruit mango=new Fruit();
		Fruit juice=mango.createclone();
		
		mango.name="I am Malcova Mango";
		juice.name="i am mango juice";
		
		System.out.println(mango.name);
		System.out.println(juice.name);
	}
}

class Fruit implements Cloneable{
	String name;
	public Fruit() {
		System.out.println("Fruit object created...");
	}
	public Fruit createclone()throws Exception {
		return(Fruit)super.clone();
	}
}