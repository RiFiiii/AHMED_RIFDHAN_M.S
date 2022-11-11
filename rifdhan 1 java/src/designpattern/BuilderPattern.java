package designpattern;

public class BuilderPattern {
	public static void main(String[] args) {
		Car car=new Car.Benz().setCar("BENZ ").setCarModel("Mercedes-Benz EQS").setCost(24500000).setAddress("4/115 East street Kilakarai").build();
		System.out.println(car);
	}
}

class Car{
	private String car;
	private String carmodel;
	private int cost;
	private String address;
	
	
	
	public Car(Benz b) {
	this.car=b.car;
	this.carmodel=b.carmodel;
	this.cost=b.cost;
	this.address=b.address;
	}
	@Override
	public String toString() {
		return  
				"Car :"+this.car+": Car Model :"+this.carmodel+": Amount in Rupees : "+this.cost+": Delivary Address :"+this.address;
	}
	static class Benz{
		private String car;
		private String carmodel;
		private int cost;
		private String address;
		
		public Benz setCar(String car) {
			this.car=car;
			return this;
		} 
		public Benz setCarModel(String carmodel) {
			this.carmodel=carmodel;
			return this;
		}
		public Benz setCost(int cost) {
			this.cost=cost;
			return this;
		}
		public Benz setAddress(String address) {
			this.address=address;
			return this;
		}
		public Car build() {
			return new Car(this);
		} 
	}
} 
