package designpattern;

public class DecoratePattern2 {

	public static void main(String[] args) {
		Albaik myfood=new CheeseChickenPizza(new FrenchFries(new Juice(new Ready1())));
		System.out.println(myfood);
		System.out.println("Your Order is ready Pay and Get :"+myfood.cost());
	}
}

abstract class Albaik{
	public abstract int cost();
}

abstract class Food3 extends Albaik{
	
}

class ChickenBurgerCombo extends Food3{
	Albaik abk;
	public ChickenBurgerCombo() {
		
	}
	public ChickenBurgerCombo(Albaik abk) {
		this.abk=abk;
	}
	@Override
	public String toString() {
		return " Chicken Combo Ready"+abk;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return (abk==null)?500:500+abk.cost();
	}
}

class CheeseChickenPizza extends Food3{
	Albaik abk;
	public CheeseChickenPizza() {
		
	}
	public CheeseChickenPizza(Albaik abk) {
		this.abk=abk;
	}
	@Override
	public String toString() {
		
	return" Pizza Ready.."+abk;
	}
	@Override
	public int cost() {
		
		return (abk==null)?800:800+abk.cost();
	}
}


abstract class Add extends Albaik{
	
}

class FrenchFries extends Add{
	Albaik abk;
	public FrenchFries() {
		
	}
	public FrenchFries(Albaik abk) {
		this.abk=abk;
	}
	@Override
	public String toString() {
		return " French Fries Added"+abk;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return (abk==null)?350:350+abk.cost();
	}
}

class Juice extends Add{
	Albaik abk;
	public Juice() {
		
	}
	public Juice(Albaik abk) {
		this.abk=abk;
	}
	@Override
	public String toString() {
		return " Coke Is Ready..."+abk;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return (abk==null)?200:200+abk.cost();
	}
}

class Ready1 extends Albaik{
	public Ready1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " Your Order is Ready";
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 0;
	}
}