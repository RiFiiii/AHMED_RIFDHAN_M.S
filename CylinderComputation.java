package assignment;

public class CylinderComputation {
	public static void main(String[] args) {
		double radius,height,surfaceArea,baseArea,volume;
		
		final double PI=3.15;
		
		radius=56;
		
		height=79;
		
		surfaceArea=2*PI*radius*height+2*PI*radius*radius;
		
		baseArea=PI*radius*radius;
		
		volume=PI*radius*radius*height;
		
		System.out.println("the surfaceArea of cylinder is..:"+surfaceArea);
		
		System.out.println("the baseArea of cylinder is..:"+baseArea);
		
		System.out.println("the volume of cylinder is..:"+volume);
	}
}
