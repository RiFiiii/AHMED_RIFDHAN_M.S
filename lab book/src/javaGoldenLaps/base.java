package javaGoldenLaps;
public class base{
String method() {
return"wow";
}
}
class derived{
	public void used() {
		base z=new base();
		System.out.println("base says,"+z.method());
	}
}