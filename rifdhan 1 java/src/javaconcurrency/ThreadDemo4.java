package javaconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {

	public ThreadDemo4() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{System.out.println("Child Thread Logic...");});
		es.shutdown();
	}
	
	public static void main(String[] args) {
		new ThreadDemo4();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread..."+i);
		try {
			Thread.sleep(500);
		}catch(Exception e) {}
		}
	}
}
