package javaconcurrency;

import java.util.concurrent.ExecutorService;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		
		met1();
		met2();
		met3();
		
	}
	static void met1() {
		System.out.println("Met 1 called...");
	}
	static void met2() {
		System.out.println("Met 2 called");
		try {
			Thread.sleep(6000);
		}catch(Exception e) {
		}System.out.println("Met 2 FInished...");
	}
	static void met3() {
		System.out.println("Met 3 called...");
	}
}
