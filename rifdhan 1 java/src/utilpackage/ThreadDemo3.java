package utilpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo3 {

	public ThreadDemo3() throws Exception{
		
	ExecutorService es=Executors.newFixedThreadPool(1);
	Callable<String>cs=()->{
		System.out.println("Child Thread Called....");
		try {Thread.sleep(5000);}catch(Exception e){}
		return "hello from child thread...job...over...";
	};
	Future<String>future=es.submit(cs);
	String s=future.get();
	System.out.println(s);
	es.shutdown();
}
	public static void main(String[] args)throws Exception {
		new ThreadDemo3();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.currentThread().sleep(1000);
		}
	}
}

class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Child threaf called");
		try {Thread.sleep(5000);}catch(Exception e) {}
		return "hello from child thread...job..over..";
	}
}