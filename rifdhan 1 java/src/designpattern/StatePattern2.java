package designpattern;

import java.util.Scanner;



public class StatePattern2 {

	public static void main(String[] args) {
		JerryBike jb=new JerryBike();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press Enter to change Gear.");
		while(true) {
		sc.next();
		jb.pull();
}
}
}

class JerryBike{
	State1 state=new Neutral();
	public void pull() {
		state.ChangeBikeState(this);
	}
}

abstract class State1{
	public abstract void ChangeBikeState(JerryBike bike);
}

class Neutral extends State1{
	@Override
	public void ChangeBikeState(JerryBike bike) {
		System.out.println("First Gear Changed");
		bike.state=new FirstGear();
	}
}

class FirstGear extends State1{
	@Override
	public void ChangeBikeState(JerryBike bike) {
				System.out.println("Second Gear Changed");
				bike.state=new SecondGear();
	}
}
class SecondGear extends State1{
	@Override
	public void ChangeBikeState(JerryBike bike) {
		System.out.println("Third Gear Changed..");
		bike.state=new ThirdGear();
		
	}
}
class ThirdGear extends State1{
	@Override
	public void ChangeBikeState(JerryBike bike) {
		System.out.println("Fourth Gear Changed");
		bike.state=new FourthGear();
	}
}

class FourthGear extends State1{
	@Override
	public void ChangeBikeState(JerryBike bike) {
		System.out.println("Neutral Changed..");
		bike.state=new Neutral();
	}
}

