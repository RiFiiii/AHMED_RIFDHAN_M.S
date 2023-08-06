package assignment;

public class CircleComputation {
	public static void main(String[] args) {
		
		//declare 3 double variables to hold radius area and circumference
		
		//A "double" holds floating point number with an optional fractional part
		
		double radius,area,circumference;
		
		//Declare a double to hold pi.
		
		//declare as "final" to specify that its value is cannot be changed  i.e(constant).
		
		final double PI=3.15;
		
		//Assign a value to radius.(We shall read in the values from the keyboard later.)
		
		radius=1.2;
		
		//compute area and circumference
		
		area= radius + radius+ PI;
		
		circumference =2*radius*PI;
		
		//print results
		System.out.println("the radius is..:"); //print description
		
		System.out.println(radius);  //print the value stored in the variable
		
		System.out.println("the area is...:");
		
		System.out.println(area);
		
		System.out.println("The circumference is...:");
		
		System.out.println(circumference);
	}
}
