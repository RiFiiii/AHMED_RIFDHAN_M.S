package utilpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {

	public static void main(String[] args) {
		
		House house1=new House();
		House house2=new House();
	   
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized(Toilet.class){
			Thread.currentThread().setName("salmanKhan");
			House.toilet.useToilet();
			}
		});
		es.execute(()->{
			synchronized(Toilet.class) {
				Thread.currentThread().setName("Sharukhkhan");
			House.toilet.useToilet();
			}
		});
		es.shutdown();
	}
}

class House{
	public House() {
		System.out.println("House Object created...");
	}
	static Toilet toilet=new Toilet(); //
}

class Toilet{
	public Toilet() {
		System.out.println("Toilet Object is Created...");
	}
	public void useToilet() {
		Thread t=Thread.currentThread();
		System.out.println("Toilet is now Used by..: "+t.getName());
	
		try{Thread.sleep(5000);}
		catch(Exception e) {}
		System.out.println(t.getName()+" : is now out of toilet...");
	}
}