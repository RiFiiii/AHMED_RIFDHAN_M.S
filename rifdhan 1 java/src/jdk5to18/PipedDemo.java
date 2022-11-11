package jdk5to18;

import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Writer;

public class PipedDemo {

	public static void main(String[] args) {
		
		PipedReader reader=new PipedReader();
		
		PipedWriter writer=new PipedWriter();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						Thread.sleep(1000);
						writer.write("Hello World".toCharArray());
				System.out.println("\n\n");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					int data=reader.read();
					while(data!=-1) {
						System.out.print((char)data);
						data=reader.read();
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}).start();
	}
}
