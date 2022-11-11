package designpattern;

import java.util.Scanner;

public class StatePattern {

	public static void main(String[] args) {
		GoodFan gf=new GoodFan();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("press Enter to pull Fan...");
			sc.next();
			gf.pull();
		}
	}
}


class GoodFan{
	State state=new SwitchOffState();
	public void pull() {
		state.ChangeFanState(this);
	}
}

abstract class State{
	public abstract void ChangeFanState(GoodFan fan);
}

class SwitchOffState extends State{
	@Override
	public void ChangeFanState(GoodFan fan) {
		System.out.println("Switch on state..");
		fan.state=new SwitchOnState(); 
	}
}

class SwitchOnState extends State{
	@Override
	public void ChangeFanState(GoodFan fan) {
		System.out.println("Low Speed State");
		fan.state=new LowSpeedState();
	}
}

	class LowSpeedState extends State{
		@Override
		public void ChangeFanState(GoodFan fan) {
			System.out.println("Medium Speed State..");
			fan.state=new MediumSpeedState();
		}
	}
	class MediumSpeedState extends State{
		@Override
		public void ChangeFanState(GoodFan fan) {
			System.out.println("High Speed State..");
			fan.state=new HighSpeedState();
		}
	}
	class HighSpeedState extends State{
		@Override
		public void ChangeFanState(GoodFan fan) {
			System.out.println("Switch off state.");
			fan.state=new SwitchOffState();
		}
	}
