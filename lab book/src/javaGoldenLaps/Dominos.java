package javaGoldenLaps;

abstract class Dominos {
	private void makeDough() {
		System.out.println("dough made us per the Dominos standard");
	}
	private void addingIngredients() {
		System.out.println("Ingredients are added as per dominos standard");
	}
	private void makePizza() {
		makeDough();     //Template Method
		addingIngredients();
		makePizza();
	}
	abstract public void AcceptMoney();
	abstract public void DeliveryPizza();
	final public void SellPizza() {
		AcceptMoney();
		SellPizza();
		DeliveryPizza();
	}
}
class RifiiiiDominos extends Dominos{
	@Override
	public void AcceptMoney() {
		System.out.println("money is Accept in pound");
	}
	public void DeliveryPizza() {
		System.out.println("Delivery is done by car......");
	}
	}



//Study Purpose
/*
 * private is a keyword it check with in a scope
 * void is keyword it mention EmptySpace
 * public is a keyword it check outside the scope
 * method is nothing but its like do action
 * while - checks pre conditions
 * do-while  -  checks post conditions*/
