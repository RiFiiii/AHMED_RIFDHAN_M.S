package jdk5to18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
 public ThreadDemo() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new ThreadWork());
		for(int i=0;i<5;i++) {
			System.out.println(i);
}
	}
}

// runnable is a functional interface

class ThreadWork implements Runnable{
	@Override
	public void run() {
		System.out.println("Work of child thread logic...");
		
	}
}