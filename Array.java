package assignment2;

public class Array {

	
	// all complex type by default pbr.
	// array is a complex type so by default it is complex type.
	
	public static void main(String[] args) {
		
		
		int[] arr=new int[5]; // size of array 5
		int[][] td=new int[5][5]; //5 rows  and 5 columns
	
	// we can only use foreach or enhanced for loop for array
		// array are homogeneous
		// array size is fixed
		
//		to overcome this we use collections
		
		
		arr[0]=20;
		arr[1]=201;
		arr[2]=202;
		arr[3]=203;
		arr[4]=204;
		
//		for(int a:arr) {
//			System.out.println(a);
//		}
		
		td[0][0]=21;
		td[0][1]=22;
		td[0][2]=23;
		td[0][3]=24;
		td[0][4]=25;
		
		td[1][0]=21;
		td[1][1]=22;
		td[1][2]=23;
		td[1][3]=24;
		td[1][4]=25;
		
//		for(int[]b:td ) {
//			System.out.println(b);
//		}
		System.out.println(td[0][0]);
		System.out.println(td.length);
	}
}


