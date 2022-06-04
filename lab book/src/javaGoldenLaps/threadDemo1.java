package javaGoldenLaps;

public class threadDemo1 {

	public static void main(String[] args) {
		new Thread(()->{threadDemo1.met2();}).start();
		new Thread(()->{threadDemo1.met3();}).start();
		System.out.println("first line...");
		System.out.println("second line...");
		System.out.println("third line...");
		met1();
	}
	static void met1() {
		System.out.println("met 1 called.....");
		try {Thread.sleep(5000);}catch(Exception e) {}
}
	static int met2() {
		System.out.println("met 2 called.....");
		return 1;
}
	static void met3() {
		System.out.println("met 3 called");
	}
}