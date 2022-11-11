package javaconcurrency;

public class ThreadDemo2 {

	public ThreadDemo2() {
		Thread t=new Thread(new MyRunnable());
		t.start(); //calls the run method.
	}
	public static void main(String[] args) {
		new ThreadDemo2();
		System.out.println("main thread....");
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		// job of the thread
		System.out.println("job of the child thread is written here...");
	}
}