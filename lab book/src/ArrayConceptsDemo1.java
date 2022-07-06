
public class ArrayConceptsDemo1 {

	public static void main(String[] args) {
		 //single Dimensional Array
		//One row-MULTIPLE Columns
		int[] arr=new int[] {90,7,86,5,'c',4};
		
		char c[]= {'a','v','k',97};
		char cc[]=new char[10];
		
		//or 
		
		int arr2[]= {12,43,54,65,76};
		int arr3[]= new int[5];//by default zero will be assigned
		//how to Access Array Values
		
		System.out.println(arr3[2]);
		System.out.println(arr3[4]);
		
		System.out.println(arr3.length);//no of columns
		
		//how to allocate Values to Array
		
		arr3[2]=9000;
		arr3[4]=999000;
		
		System.out.println(arr3[2]);
		System.out.println(arr3[4]);
	}

}
