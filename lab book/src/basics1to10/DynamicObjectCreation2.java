package basics1to10;

import java.util.Scanner;

public class DynamicObjectCreation2 {
public static void main(String[] args)throws Exception {
	

//	Shoe shoe=new Shoe();
//	shoe.buy();
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a classname either sample1 or sample2");
		String classname=scan.next();
		FootWear fw=(FootWear)Class.forName(classname).getConstructor(null).newInstance(null);
		
}
}

abstract class FootWear{
	public abstract void buy();
}
class Shoe extends FootWear{
	public void buy() {
		System.out.println("Sheo met is called...");
	}
}

class Slipper extends FootWear{
	public void buy() {
		System.out.println("Slipper met is called");
	}
}