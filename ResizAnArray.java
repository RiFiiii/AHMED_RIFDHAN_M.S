package assignment2;

public class ResizAnArray {

	
	public static void main(String[] args) {	
		// resize and array
		
		int[] elements=new int[5];
		elements=new int[10];
		elements=new int[12];
		
		for(int nums:elements) {
			System.out.println(nums);
		}


		
		System.out.println(elements.length);
		
	}
}
