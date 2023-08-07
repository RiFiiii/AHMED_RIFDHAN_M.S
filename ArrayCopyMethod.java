package assignment2;

public class ArrayCopyMethod {

	
	public static void main(String[] args) {
		int[] elements= {1,2,3,4,5,6};
		int[] hold= {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(elements, 0, hold, 0, elements.length);
		System.out.println(hold);
		System.out.println(elements);
	}
}
