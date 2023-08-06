package advancelabook3;

public class Multiton {
public static void main(String[] args)throws Exception {
	// prototype // Resource are shared but properties are unique.
	Sheep motherSheep=new Sheep();
	Sheep dolly=motherSheep.createClone();
	
	motherSheep.name="I Am Mother";
	dolly.name="I AM Clone Dolly";
	
	System.out.println(motherSheep.name);
	System.out.println(dolly.name);
}
}

class Sheep implements Cloneable{
	String name;
	public Sheep() {
		System.out.println("Sheep Object Created..");
	}
	public Sheep createClone()throws Exception{
		return(Sheep)super.clone();
	}
}