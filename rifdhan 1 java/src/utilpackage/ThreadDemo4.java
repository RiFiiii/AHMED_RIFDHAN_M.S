package utilpackage;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {

	public static void main(String[] args) {
		Kitchen kitchen=new Kitchen();
		kitchen.prepareFood();
	}
}

class Kitchen{
	public void prepareFood() {
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(()->{
			LocalTime lt1=LocalTime.now();
			System.out.println("Start time..."+lt1);
			Briyani briyani=new Briyani();
			briyani.makeBriyani();
			LocalTime lt2=LocalTime.now();
			System.out.println("Start time...:"+lt2);
			System.out.println("time taken to make food.: ");
		});
		es.execute(()->{
			Chutney chutney=new Chutney();
			chutney.makeChutney();
		});
		es.execute(()->{
			Sweet sweet=new Sweet();
			sweet.makeSweet();
		});
		es.shutdown();
	}
}

class Briyani{
	public void makeBriyani() {
		System.out.println("Briyani Preparatio started...");
		
		try {Thread.sleep(10000);}
		catch(Exception e) {}
		System.out.println("Briyani preparation started...");
		
		try {Thread.sleep(10000);}
		catch(Exception e) {}
		System.out.println("Briyani Ready..");
	}
}

class Chutney{
	public void makeChutney() {
		System.out.println("Chutney Preparation Started...");
	
		try {Thread.sleep(2000);}
		catch(Exception e) {}
		System.out.println("Use Kitchen for Chutney Preparation...");
		
		try {Thread.sleep(2000);}
		catch(Exception e) {}
		System.out.println("Chutney Ready....");
	}
}

class Sweet{
	public void makeSweet() {
		System.out.println("Sweet Preparation Started..");
		
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		System.out.println("Uses Kitchen for Sweet Preparation..");
		
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		System.out.println("Sweet Ready...");
	
	}
}