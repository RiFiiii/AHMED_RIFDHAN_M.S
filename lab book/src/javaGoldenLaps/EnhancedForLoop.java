package javaGoldenLaps;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int arr[]= {12,34,56,78};
		int arr2[]=new int[5];
		int length=arr.length;
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]+"/t");
		}
		//enhanced for loop
		System.out.println("/n________________");
	for(int i:arr) {
		System.out.println(i+"/t");
	}
	System.out.println("/n++++++++++++++++");
	String Str[]=new String[5];
	for(int i=0;i<Str.length;i++) {
		Str[i]="hello"+i;
	}
	for(String s:Str) {
		System.out.println(s+"/t");
	}
	}
}