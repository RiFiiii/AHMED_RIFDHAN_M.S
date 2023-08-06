package advancelabook3;

public class ConsDemo2 {

	public static void main(String[] args) {
		
	
	Hotel ho=new Hotel();
	ho.makeFood();
//	ho.makeFoodForOwner();
	ho.createFoodForOwner();
	
}}

class Hotel{
	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	public void makeFood() {
		Food fo=new Food("tasty",110);
//		System.out.println("Food is created");
	
	}
	public void makeFoodForOwner() {
		Food fo=new Food("Tasty");
//		System.out.println("Food is Created for owner");
	}
	
	class Food{
		public Food() {
			System.out.println("Normal food Craeted");
		}
		private Food(String taste) {
			System.out.println("Food is Make for Owner"+taste);
		}
		public Food(String taste,int money) {
			if(money>10) {
				System.out.println("Food is Make in good"+taste);
			}
			else {
					System.out.println("Normal food Created");
			}
			
		}

		
	}
	public void createFoodForOwner() {
		
		Food owner=new Food("Tasty");
	}
}


