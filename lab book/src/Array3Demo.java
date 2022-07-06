
public class Array3Demo {

	public static void main(String[] args) {
		int twoue[][]= {
				{10,20},
				{12,2,3,34,54},
				{90}
		};
		int twoue2[][]=new int[3][];
		twoue2[0]=new int[7];//7 columns assigned for first row
				twoue2[1]=new int[5];//5 columns assigned for second row
						twoue2[2]=new int[3];//3 columns assigned for third row
		System.out.println(twoue.length);//this will return number of rows
		System.out.println(twoue[0].length);//this will return number of columns of first row
		
		// how to read
		
		System.out.println(twoue[0][0]);
		twoue[0][0]=32432432;
		System.out.println(twoue[0][0]);
		
		

	}

}
