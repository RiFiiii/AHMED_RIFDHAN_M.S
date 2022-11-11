package designpattern;

public class BuilderPattern4 {
public static void main(String[] args) {
	
	Food myfood=new Food.Swiggy().setFoodItem("Chicken noodles").setPacking("Delivered soon.").setCost(160).setAddresss("Room:no 210 MMa Hostel kenneth lane Egmore 600008").build();
	System.out.println(myfood);
}
}

class Food{
	private String fooditem;
	private String packing;
	private int cost;
	private String address;
	
	public Food(Swiggy sy) {
		 this.fooditem=sy.fooditem;
		 this.packing=sy.packing;
		 this.cost=sy.cost;
		 this.address=sy.address;
	}
	@Override
	public String toString() { 
		return  
				"Ordered Food : "+this.fooditem+": Order Confirmed : "+this.packing+": Your Order Amount :"+this.cost+": Your Address :"+this.address;
				
	}
	static class Swiggy{
		private String fooditem;
		private String packing;
		private int cost;
		private String address;
		
		public Swiggy setFoodItem(String fooditem) {
			this.fooditem=fooditem;
			return this;
		}
		public Swiggy setPacking(String packing) {
			this.packing=packing;
			return this;
		}
		public Swiggy setCost(int cost) {
			this.cost=cost;
			return this;
		}
		public Swiggy setAddresss(String address) {
			this.address=address;
			return this;
		}
		public Food build() {
			return new Food(this);
		}
	}
}
