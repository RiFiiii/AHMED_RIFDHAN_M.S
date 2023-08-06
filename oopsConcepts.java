package assignment;

public class oopsConcepts {

	public static void main(String[] args) {
		Food food=new Food(10);
		System.out.println(food.giveChange());
		food.distributedFood();
		
	}
}

class Food{
	int m;
	public Food(int m) {
		this.m=m;
	}
	public int giveChange() {
		int change=m-5;
		return change;
	}
	public void distributedFood() {
		new orphange().acceptFood(this);
	}
}
class orphange{
	public void acceptFood(Food food) {
		System.out.println(food);
	}
}