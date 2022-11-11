package javaconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo3 {

	public ThreadDemo3() {
		ExecutorService es=Executors.newFixedThreadPool(1);
//		es.execute(new MyRunnable());
		es.execute(()->{System.out.println("Chile thread logic");});
		es.shutdown();
	}
	public static void main(String[] args) {
		new ThreadDemo3();
		System.out.println("main thread");
	}
}
