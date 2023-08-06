package assignment;

public class Inher {
public static void main(String[] args) {
//	Car c=new Bugatti();
//	System.out.println(c.i);
//	c.met();
//	c.met2();
	CarShowRoom cs=new CarShowRoom();
	cs.c=new Bugatti();
	System.out.println(cs.c);
}
}
class CarShowRoom{
	Car c;
}
abstract class Car{
	int i=20;
	public void met() {
		System.out.println("Car Met Called..");
	}
	public abstract void met2();
}

class Bugatti extends Car{
	@Override
	public void met2() {
		System.out.println("Bugatti met called...");
	}
}
