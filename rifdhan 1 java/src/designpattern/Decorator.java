package designpattern;

public class Decorator {

	public static void main(String[] args) {
		IbacoIceCream cream=new StrawBerry(new ChocoBalls(new WafferRoll(new RainbowBeans(new Ready()))));
		System.out.println(cream);
		System.out.println("Totol cost of IceCream "+cream.cost());
	}
}

abstract class IbacoIceCream{
	public abstract int cost();
}

abstract class Cream extends IbacoIceCream{
	
}
class Vanilla extends Cream{
	IbacoIceCream iic;
	public Vanilla() {
	
	}
	public Vanilla(IbacoIceCream iic) {
		this.iic=iic;
	}
	@Override
	public String toString() {
		return "Vanilla IceCream"+iic;
	}
	@Override
	public int cost() {
		
		return (iic==null)?20:20+iic.cost();
	}
}

class StrawBerry extends Cream{
	IbacoIceCream iic;
	public StrawBerry() {
		
	}
	public StrawBerry(IbacoIceCream iic) {
		this.iic=iic;
	}
	@Override
	public String toString() {
		return "StrawBerry IceCream Ready"+iic;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return (iic==null)?25:25+iic.cost();
	}
}

abstract class AddsOn extends IbacoIceCream{
	
}

class ChocoBalls extends AddsOn{
	IbacoIceCream iic;
	public ChocoBalls() {
		// TODO Auto-generated constructor stub
	}
	public ChocoBalls(IbacoIceCream iic) {
		this.iic=iic;
	}
	@Override
	public String toString() {
		return"Choco Balls Added"+iic;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return (iic==null)?20:20+iic.cost();
	}
}

class RainbowBeans extends AddsOn{
	IbacoIceCream iic;
	public RainbowBeans() {
		
	}
	public RainbowBeans(IbacoIceCream iic) {
		this.iic=iic;
	}
	@Override
	public String toString() {
		return"Rainbow Beans Added.."+iic;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return (iic==null)?25:25+iic.cost();
	}
}

class WafferRoll extends AddsOn{
	IbacoIceCream iic;
	public WafferRoll() {
		
	}
	public WafferRoll(IbacoIceCream iic) {
		this.iic=iic;
	}
	@Override
	public String toString() {
		return"Waffer Rolls Added"+iic;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return (iic==null)?35:35+iic.cost();
	}
}

class Ready extends IbacoIceCream{
	public Ready() {
		
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Your order is ready";
	}
}
