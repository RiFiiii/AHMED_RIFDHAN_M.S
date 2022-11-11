package javaconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo9 {

	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		AdmissionHall newCollege=new AdmissionHall();
		
		es.execute(()->{
			Thread.currentThread().setName("Rifdhan");
			
			newCollege.table1();
			newCollege.table2();
			newCollege.table3();
		});
		
		es.execute(()->{
			Thread.currentThread().setName("Mafaz");
			newCollege.table1();
			newCollege.table2();
			newCollege.table3();
		});
		es.execute(()->{
			Thread.currentThread().setName("Irfan");
			newCollege.water();
		});
	}
}

class AdmissionHall{
	synchronized public void table1() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the table 1");
		try {
			Thread.sleep(4000);
		}catch(Exception e) {}
		System.out.println(name+" left the table 1..");
	}
	synchronized public void table2() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the table 2..");
		try {
			Thread.sleep(6000);
		}catch(Exception e) {}
		System.out.println(name+" left the table 2...");
	}
	synchronized public void table3() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is inside the table 3..");
		try {
			Thread.sleep(8000);
		}catch(Exception e) {}
		System.out.println(name+" left the table 3...");
	}
	public void water() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is Drinking Water..");
	}
}