package designpattern;

public class FactoryPattern2 {

	public static void main(String[] args) {
		ComputerShop myshop=new ComputerShop();
		myshop.setComputerFactory(new GamingComputer());
		System.out.println(myshop.SellComputer());
	}
}

class ComputerShop{
	ComputerFactory ComputerFactory;
	public void setComputerFactory(ComputerFactory ComputerFactory) {
		this.ComputerFactory=ComputerFactory;
	}
	public Computer12 SellComputer() {
		return ComputerFactory.MakeComputer();
	}
}

abstract class ComputerFactory{
	public abstract Computer12 MakeComputer();
}

class GamingComputer extends ComputerFactory{
	public Computer12 MakeComputer() {
		return new Computer12.ComputerMaker().SetCost(400000).SetRam("64 Gb").SetGraphicsCard("RTX 3090").SetMonitor("Predator 165hz").SetProcessor("i9 12 Gen").build();
	}
}

class ProfessionalComputer extends ComputerFactory{
	public Computer12 MakeComputer() {
		return new Computer12.ComputerMaker().SetCost(40000).SetRam("4 Gb").SetGraphicsCard("Gtx 1060").SetMonitor("Windows Basic").SetProcessor("i3 10th Gen").build();
	}
}

class Computer12{
	int cost;
	String ram;
	String graphicscard;
	String monitor;
	String processor;
	public Computer12(ComputerMaker cm) {
		cost=cm.cost;
		ram=cm.ram;
		graphicscard=cm.graphicscard;
		monitor=cm.monitor;
		processor=cm.processor;
	}
	
	@Override
	public String toString() {
		
		return "Actual Cost:"+cost+" : Total Ram : "+ram+" : GraphicsCard Used : "+graphicscard+" : Monitor Type And FPS :" +monitor+ ": Processor :"+processor;
	}
	static class ComputerMaker{
		int cost;
		String ram;
		String graphicscard;
		String monitor;
		String processor;
		
		public ComputerMaker SetCost(int cost) {
			this.cost=cost;
			return this;
		}
		public ComputerMaker SetRam(String ram) {
			this.ram=ram;
			return this;
		}
		public ComputerMaker SetGraphicsCard(String graphicscard) {
			this.graphicscard=graphicscard;
			return this;
		}
		public ComputerMaker SetMonitor(String monitor) {
			this.monitor=monitor;
			return this;
		}
		public ComputerMaker SetProcessor(String processor) {
			this.processor=processor;
			return this;
		}
		public Computer12 build() {
			return new Computer12(this);
		}
	}
}