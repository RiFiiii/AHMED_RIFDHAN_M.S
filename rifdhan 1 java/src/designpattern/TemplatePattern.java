package designpattern;

public class TemplatePattern {

	public static void main(String[] args) {
	CarTemplate cartype=new RaceCar();
	cartype.buildCar();
	
	System.out.println("   ");
	
	cartype=new BasicCar();
	cartype.buildCar();
	
	}
}

abstract class CarTemplate{
	
	//template = prebuild pattern or design
	//template method,final so subclasses cannot override
    // final keyword is constant it cannot be changed.
    
	public final void buildCar() {
		 buildTire();
		 buildWindow();
		 buildEngine();
		 buildNitro();
		 System.out.println("Car is Build");
	}
   
	public void buildEngine() {
		
	}
	
	public void buildNitro() {
		
	}
	private void buildTire() {
		System.out.println("Racing Tire");
	}
	private void buildWindow() {
		System.out.println("Expensive Window with SunSheild");
	}
}

class RaceCar extends CarTemplate{
	@Override
	public void buildEngine() {
		System.out.println("PowerHouse Engine 19000 hoursePower..");
	}
	@Override
	public void buildNitro() {
		System.out.println("nitro Extreme 9000z");
	}
}

class BasicCar extends CarTemplate{
	@Override
	public void buildEngine() {
		System.out.println("Normal Car Engine ");
	}
	@Override
	public void buildNitro() {
		System.out.println("Nitro is not Required");
	}
}