package designpattern;

public class MultiTon {
public static void main(String[] args) {
	//multiton - resources and properties  both are unique
	
	sheep mothersheep=new sheep();
	sheep dolly=new sheep();
	mothersheep.name="I am the mother...";
	dolly.name="i am clone dolly";
	System.out.println(mothersheep.name);
	System.out.println(dolly.name);
}
}
