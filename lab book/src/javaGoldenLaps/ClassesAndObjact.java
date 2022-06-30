package javaGoldenLaps;

public class ClassesAndObjact {

	public static void main(String[] args) {
		 PaintBrush obj=new PaintBrush();
		 obj.dopaint(2);
	}
}
class PaintBrush{
	public void dopaint(int i) {
		if(i==1) {
			System.out.println("red colour....");
		}
		else if (i==2) {
			System.out.println("blue colour...");
		}
		else {
			System.out.println("green colour...");
		}
	}
}