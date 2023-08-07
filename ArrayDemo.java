package assignment2;

/* 			Array points to Remember..
 * 
 * 	1.Array Size maximum is  32 bit...
 *  2. Arrays are Represented in memory in a single memory slot..
 *  3.Array size Cannot be changed..
 *  4.Arrays are homogeneous
 *  5.Arrays are by default objects...
 *  6.Arrays are Initialized by default (Even when they are local Variables..)
 * 
 * */


public class ArrayDemo {

	static int mm; // by default class variables and instance variables are initialized
	static int[] arr;
	public static void main(String[] args) {
	
		System.out.println(mm); //initialized by default
		mm=100;
		System.out.println(mm); //after initialized a value..
		
		System.out.println(arr); //by default it will print null
		
		arr=new int[8];
		
		System.out.println(arr);
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		arr[5]=600;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[7]);
//		System.out.println(arr.length);
		
		int[] arr1= {1,23,4,3,54,65,4,33,21};// once you declared an array you cannot modify.
		int[] arr2=new int[10];
		System.arraycopy(arr, 0,arr2, 0, arr.length);
		System.arraycopy(arr1,0,arr2,0,arr1.length);
		System.out.println(arr2);
		System.out.println(arr2[5]);
		
		int[] a= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length-1;i--) {
			System.out.println(i);
		}
	}
}
