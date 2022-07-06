package inheritance;

public class ArrayDemo2 {

	public static void main(String[] args) {
	 int [][]twod= {
			 {23,4,3,2,32},
			 {98,6,75,4,},
			 {5,4,645,3,2}
	 };
	 int[][]twod1=new int[3][5];//array declared with 3 rows and 5 columns
	 
	 System.out.println(twod.length);//this will returns number of rows in twod
	 System.out.println(twod1.length);//this will returns number of rows in twod1
	 
	 System.out.println(twod[1].length);
	 System.out.println(twod1[0].length);
	 
	 //how to read
	 
	 System.out.println(twod[0][1]);
	 twod1[0][0]=74282;
	 System.out.println(twod1[0][0]);
	 
	}

}
