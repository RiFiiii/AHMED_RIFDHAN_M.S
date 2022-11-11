package utilpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Synchronized is used for Double dip Problem...


public class ThreadDemo5 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{SingleTon.getSingleTon();});
		es.execute(()->{SingleTon.getSingleTon();});
		
		es.shutdown();
	}
}


class SingleTon{
	public SingleTon() {
		System.out.println("Cons Called....");
	}
	private static SingleTon single;
	synchronized public static SingleTon getSingleTon() {
		if(single==null) {
			single=new SingleTon();
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
		return  single;
	}
}