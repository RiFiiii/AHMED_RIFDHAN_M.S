package advancelabook3;

public class ClassDemo5 {

	public static void main(String[] args) {
		
		int[] arr=new int[4];
		
		for (int i:arr) {
			System.out.print(i+"\t");
			
			ClassDemo5 sd=new ClassDemo5();
			
			sd.acceptArray(arr);
			
			for(int j: arr) {
				System.out.print(j+"\t");
		}
	}
	
	}
	public void acceptArray(int arr[]) {
		arr[1]=100;
		arr[3]=500;
		}
}
