package javaconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo8 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		ReservationCounter central=new ReservationCounter();
		
		es.execute(()->{
			Thread.currentThread().setName("Sanjay");
			synchronized (central) {
				central.bookTicket(700);
				central.giveChange();
			}
		});
		es.execute(()->{
			Thread.currentThread().setName("Rifdhan");
			synchronized (central) {
				central.bookTicket(2000);
				central.giveChange();
			}
			
		});
		es.shutdown();
		
	}
}

class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the Counter....");
		try {
			Thread.sleep(4000);
		}catch(Exception e) {}
			System.out.println(name+" left the counter...");
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is Waiting for the Change..");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(name+" left with the change "+(amt-100));
	}
}