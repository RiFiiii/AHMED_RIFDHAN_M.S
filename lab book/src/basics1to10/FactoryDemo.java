package basics1to10;

public class FactoryDemo {

	public static void main(String[] args) {
		
	
	CarShowRoom myshowroom=new CarShowRoom();
	myshowroom.setCarFactory(new RollsRoyce());
	System.out.println(myshowroom.SellCar());
	
}
}
class CarShowRoom{
	CarFactory CarFactory;
	public void setCarFactory(CarFactory CarFactory) {
		this.CarFactory=CarFactory;
	}
	public Car SellCar() {
		return CarFactory.MakeCar();
	}
}

abstract class CarFactory{
	public abstract Car MakeCar(); 
}

class BenzFactory extends CarFactory{
	public Car MakeCar() {
		return new Car.CarMaker().setCost(89000002).setCarName("Benz ").setCarModel("Mercedes Benz").build();
	}
}

class RollsRoyce extends CarFactory{
	public Car MakeCar() {
		return new Car.CarMaker().setCost(778799000).setCarName("RollsRoyce ").setCarModel("Limited Edition").build();
	}
}



class Car{
	int cost;
	String carname;
	String carmodel;
	public Car(CarMaker cm) {
		cost=cm.cost;
		carname=cm.carname;
		carmodel=cm.carmodel;
	}
	@Override
	public String toString() {
		return "CarPrice :"+ cost +": CarName : "+carname+": CarModel : "+carmodel;	}
	static class CarMaker{
		int cost;
		String carname;
		String carmodel;
		
		public CarMaker setCost(int cost) {
			this.cost=cost;
			return this;
		}
		public CarMaker setCarName(String carname) {
			this.carname=carname;
			return this;
		}
		public CarMaker setCarModel(String carmodel) {
			this.carmodel=carmodel;
			return this;
		}
		public Car build() {
			return new Car(this);
		}
	}
	
}