package jdk5to18;

public class VarArgsDemo {

	public void method(int...a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		VarArgsDemo obj=new VarArgsDemo();
		obj.method(1,2,23,3,43,3,4545,3,43,43,4);
	}
}
