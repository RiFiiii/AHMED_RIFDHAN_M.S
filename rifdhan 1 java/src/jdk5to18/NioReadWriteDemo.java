package jdk5to18;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioReadWriteDemo {

	public static void main(String[] args)throws Exception {
		
		RandomAccessFile aFile=new RandomAccessFile("abc.txt", "rw");

		FileChannel inChannel =aFile.getChannel();
		
		ByteBuffer buffer=ByteBuffer.allocate(4);
		
		int bytesRead=inChannel.read(buffer);
		
		
		while(bytesRead !=-1) {
			System.out.println("Read...: "+bytesRead);
			buffer.flip();
			while(buffer.hasRemaining()) {
				System.out.println((char)buffer.get());
			}
			buffer.clear();
			bytesRead=inChannel.read(buffer);
			
		}
		aFile.close();
		
	}
}
