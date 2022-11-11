package utilpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {

	 public ThreadDemo2() {
		
		 
		 ExecutorService es=Executors.newFixedThreadPool(2);
		 es.execute(()->{
		 Thread t=Thread.currentThread();
		 t.setName("1 ST Thread is created..");
		 t.setPriority(5);
		 System.out.println("Child Thread is Called and my name is...: "+t.getName());
		 System.out.println(t);
		 });
		 es.execute(()->{
			 Thread t=Thread.currentThread();
			 t.setName("2nd Thread");
			 t.setPriority(8);
			 System.out.println("Child thread is Called...and my name is..:"+t.getName());
			 System.out.println(t);
		 });
		 es.shutdown();
}
	 public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
		t.setPriority(10);
		t.setName("Mother Thread");
		System.out.println(t);
		new ThreadDemo2();
		for (int j=0;j<=5;j++) {
			System.out.println(j);
			t.sleep(10000);
		}
	}
}