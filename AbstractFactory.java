package advancelabook3;

public class AbstractFactory {
public static void main(String[] args) {
	WholeSaleBelt ws=new WholeSaleBelt();
	ws.SetFactory(new PerimeduBeltShop());
	System.out.println(ws.sellBelt());
}
}

abstract class Beltfactory{
	public abstract Belt makeBelt();
} 

class WholeSaleBelt{
	Beltfactory beltfactory;
	public void SetFactory(Beltfactory beltfactory) {
		this.beltfactory=beltfactory;
	}
	public Belt sellBelt() {
		return beltfactory.makeBelt();
	}
}

class PerimeduBeltShop extends Beltfactory{
	@Override
	public Belt makeBelt() {
		return new Belt.BeltMaker().setCost(500).setLength(75).setQuality("Leather Belt").build();
	}
}

class LocalBeltShop extends Beltfactory{
	@Override
	public Belt makeBelt() {
		return new Belt.BeltMaker().setCost(1000).setLength(75).setQuality("Leather 2nd Quality").build();
	}
}

class Belt{
	int length;
	int cost;
	String quality;
	public Belt(BeltMaker bm) {
		this.length=bm.length;
		this.cost=bm.cost;
		this.quality=bm.quality;
	}
	
	@Override
	public String toString() {
		return "Belt Length : "+this.length+" Cost : "+this.cost+" Quality : "+this.quality;
	}
	
	static class BeltMaker{
		int length;
		int cost;
		String quality;
		
		public BeltMaker setLength(int length) {
			this.length=length;
			return this;
		}
		
		public BeltMaker setCost(int cost) {
			this.cost=cost;
			return this;
		}
		public BeltMaker setQuality(String quality ) {
			this.quality=quality;
			return this;
		}
		public Belt build() {
			return new Belt(this);
		}
	}
}