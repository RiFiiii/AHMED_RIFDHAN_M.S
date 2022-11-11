package designpattern;

public class ProtoTypeDemo {

	public static void main(String[] args) throws Exception {
		
		
		//singleton - resources and properties both are shared
		//sheep mothersheep=new sheep();
//		sheep dolly=mothersheep;
		
//		mothersheep.name="i am the mother...";
//		System.out.println(dolly.name);
		
		//multiton - resources and properties  both are unique
		
//		sheep mothersheep=new sheep();
//		sheep dolly=new sheep();
//		mothersheep.name="I am the mother...";
//		dolly.name="i am clone dolly";
//		System.out.println(mothersheep.name);
//		System.out.println(dolly.name);
		
		//prototype /clone -resources are shared but properties are unique
		
		sheep mothersheep=new sheep();
		sheep dolly=mothersheep.createClone();
		
		mothersheep.name="i am the mother..";
		dolly.name="i am the clone dolly...";
		System.out.println(dolly.name);
		System.out.println(mothersheep.name);
				
	}
}

class sheep implements Cloneable{
	
	String name;
	public sheep() {
		System.out.println("sheep Object created..");
	}
	public sheep createClone() throws Exception{
		return(sheep)super.clone();
	}
}
