
public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		 //we can declared two ways of multiDimensionalArray 
		Integer ars [] []= new Integer[3][2]; //integer is a wrapper class for int
		//this very much resembles to a 3x2 matrix where 3 represents row and 2 represents columns.
		int pqr [][]=new int[][] {{1,2,3},{4,5,6},{6,7,8},{7,8,9}};//it will be like 4x3 matrix
		for(int i=0;i<4;i++) {
			for(int j=0;i<3;i++) {
		
		System.out.println(pqr);
		System.out.println(ars);
		}
	}
	}
}
