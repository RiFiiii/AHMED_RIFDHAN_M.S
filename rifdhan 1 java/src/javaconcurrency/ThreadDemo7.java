package javaconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Building lic=new Building();
		Building lic2=new Building();
		
		es.execute(()->{
			Thread.currentThread().setName("Ramesh");
			synchronized (Building.class) {
				Building.sulab.useToilet();
				lic.mr.useManagerRoom();
			}
		});
		es.execute(()->{
			Thread.currentThread().setName("somu");
			synchronized (Building.class) {
				Building.sulab.useToilet();
				lic2.mr.useManagerRoom();
			}
		});
		es.shutdown();
	}
}

class Building{
	static RestRoom sulab=new RestRoom();
	ManagerRoom mr=new ManagerRoom();
}
class RestRoom{
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the toilet...");
		try {
			Thread.sleep(7000);
		}catch(Exception e) {}
		System.out.println(name+" left the toilet...");
	}
}
class ManagerRoom{
	public void useManagerRoom() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+ " is inside the manager room....");
		try {
			Thread.sleep(6000);
		}catch(Exception e) {}
		System.out.println(name+" left the manager room...");
	}
}