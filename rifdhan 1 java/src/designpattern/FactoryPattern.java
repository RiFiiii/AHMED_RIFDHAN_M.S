package designpattern;

public class FactoryPattern {
public static void main(String[] args) {
	
	CakeShop myshop=new CakeShop();
	myshop.setCakeFactory(new RaniCakeFactory());
	System.out.println(myshop.sellcake());
	
}
}
	
	class CakeShop{
		CakeFactory CakeFatory;
		public void setCakeFactory(CakeFactory CakeFactory) {
			this.CakeFatory=CakeFactory;
		}
		public Cake sellcake() {
			return CakeFatory.makeCake();
		}
		
	}

		abstract class CakeFactory{
			public abstract Cake makeCake();
		}
		class RajaCakeFactory extends CakeFactory{
			public Cake makeCake() {
				return new Cake.CakeMaker().setWeight(1).setShape("Round").SetCakeType("Dark Forest").build();
				
			}
			}
		class RaniCakeFactory extends CakeFactory{
			public Cake makeCake() {
				return new Cake.CakeMaker().setWeight(2).setShape("Square").SetCakeType("Soft Cake").build();
			}
		}
class Cake{
	int weight;
	String shape;
	String caketype;
	
	public Cake(CakeMaker cm) {
		weight=cm.weight;
		shape=cm.shape;
		caketype=cm.caketype;	
	}
	@Override
	public String toString() {
		return 
				"Cake Weight :"+weight+": Cake Shape :"+shape+": Cake Type :"+caketype;

	}
	static class CakeMaker{
		int weight;
		String shape;
		String caketype;
		
		public CakeMaker setWeight(int weight) {
			this.weight=weight;
			return this;
		}
		public CakeMaker setShape(String shape) {
			this.shape=shape;
			return this;
		}
		public CakeMaker SetCakeType(String caketype) {
			this.caketype=caketype;
			return this;
		}
		public Cake build() {
			return new Cake(this);		
			}
	}
}