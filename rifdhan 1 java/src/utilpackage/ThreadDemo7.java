package utilpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {

	public static void main(String[] args) {
		
		NewCollege nc=new NewCollege();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized (RestRoom.class) {
				Thread.currentThread().setName("Staff");
				NewCollege.toilet.usetoilet();
			}
		});
		es.execute(()->{
			synchronized (RestRoom.class) {
				Thread.currentThread().setName("Students");
				NewCollege.toilet.usetoilet();
			}
		});
		
		
		es.shutdown();
	}
}


class NewCollege{
	public NewCollege() {
		System.out.println("newCollege is created...");
	}
	static RestRoom toilet=new RestRoom();
}
   class RestRoom{
	   public RestRoom() {
		System.out.println("Rest room cons is called");
		
	}
	   public void usetoilet() {
			 Thread t=Thread.currentThread();
			 System.out.println("Toilet is now Used by..:"+t.getName());
		 
			 try {Thread.sleep(5000);}
			 catch(Exception e) {}
			 System.out.println(t.getName()+" : is now out of toilet..");
		 }
	   }
   
   