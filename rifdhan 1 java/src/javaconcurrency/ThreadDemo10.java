package javaconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo10 {

	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		Gun bofors=new Gun();
		
		es.execute(()->{
			Thread.currentThread().setName("ranjith");
			for(int i=0;i<5;i++) {
				bofors.loadGun();
			}
		});
		
		es.execute(()->{
			Thread.currentThread().setName("Bhavani");
			for(int i=0;i<5;i++) {
				bofors.shootGun();
			}
		});
		es.shutdown();
	}
}

class Gun{
	boolean flag;
	synchronized public void loadGun() {
		if(flag){
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("Fill the gun...");
		flag=true;
		notify();
	}
	synchronized public void shootGun() {
		if(!flag) {
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("Shoot the Gun..");
		flag=false;
		notify();
	}
}