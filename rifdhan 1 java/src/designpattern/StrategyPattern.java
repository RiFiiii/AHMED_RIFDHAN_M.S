package designpattern;

public class StrategyPattern {
	
	public static void main(String[] args) {
		
		Dog ceaser=new Dog();
		Item item=new Stone();
		ceaser.play(item);
	}

}

class Dog{
	public void play(Item item) {
		item.execute();
	}
}


abstract class Item{
	public abstract void execute();
}
class Stick extends Item{
	@Override
	public void execute() {
		System.out.println("You beat i Bite....");
		
	}
}
class Stone extends Item{
	@Override
	public void execute() {
		System.out.println("You Throw i Catch");
		
	}
}