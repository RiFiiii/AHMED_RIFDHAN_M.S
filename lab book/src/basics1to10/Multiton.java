package basics1to10;

public class Multiton {
public static void main(String[] args) {

Food myfood=new Food();
Bike mybike=new Bike();

System.out.println(mybike);
System.out.println(myfood);

}
}


class Food{
	public Food() { //constructor
		System.out.println("Food Cons Called..");
	}
}

class Bike{
	public Bike() { 
		System.out.println("Jerry created...");
	}
}