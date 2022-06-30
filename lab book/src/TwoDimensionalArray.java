
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int arr[][]= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000},
		};
		for(int i=0;i<arr.length;i++) {
			//arr.length will return you number of rows
			for(int j=0;i<arr.length;j++) {
				//here arr.length will return number of columns
				System.out.println(arr[i][j]+"/t");
			}
			System.out.println();
		}
		System.out.println("/n......");
		for(int row[]:arr) {
			for(int j:row)
			System.out.print(j+"/t");
		}
		System.out.println();
//uneven multidimensional array
	System.out.println("/nUnEven Multi Dimensional array..............");
	int uneven[][]= {
			{10,20,30,40,50,60},
			{100,200,300},
			{1000,2000,3000},
			{1,2}
	};
	int uneven2[][]=new int[4][];
	uneven2[0]=new int[5];
	uneven2[1]=new int[3];
	uneven2[2]=new int[2];
	uneven2[3]=new int[4];
	
	for(int row[]:uneven) {
		for(int value:row) {
			System.out.println(value+"/t");
		}
		System.out.println();
	}
	
}
}
