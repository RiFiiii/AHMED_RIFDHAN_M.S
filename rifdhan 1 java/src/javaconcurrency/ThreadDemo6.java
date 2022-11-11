package javaconcurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo6 {

	public static void main(String[] args)throws Exception {
		
		System.out.println("main thread is teaching...");
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{new Worker1().eatBreakFast();});
		
		//expects a return
		
		Future<String>future=es.submit(()->{
			try {Thread.sleep(5000);}catch(Exception e) {}
			return new Worker2().payBill();
		});
		String str=future.get();
		System.out.println(str);
		es.shutdown();
		System.out.println("main thread is still teaching...");
	}
}

class Worker1{
	public void eatBreakFast() {
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println("Break Fast...");
	}
}

class Worker2{
	public String payBill() {
		return "Bill Payed sir..";
	}
}
class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(8000);
		}catch(Exception e) {}
		return new Worker2().payBill();
	}
}