package jdk5to18;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFileDemo {

	public static void main(String[] args)throws Exception {
		Path file=Paths.get("dir","src.zip");
	try {	
		boolean isRegularFile=Files.isRegularFile(file);
		System.out.println("isRegularFile...: "+isRegularFile);
		System.out.println();
		boolean isHidden=Files.isHidden(file);
		System.out.println("is hidden....: "+isHidden);
		System.out.println();
		boolean isReadable=Files.isReadable(file);
		System.out.println("is Readable..: "+isReadable);
		System.out.println();
		boolean isExecutable=Files.isExecutable(file);
		System.out.println("is Executable..: "+isExecutable);
		System.out.println();
		
		Path directory=Paths.get("dir","src.zip");
		boolean isDirectory=Files.isDirectory(directory);
		System.out.println("is Directory...: "+isDirectory);
		System.out.println();
		
		
		boolean isWritable=Files.isWritable(directory);
		System.out.println("is Writable..: "+isWritable);
		
		Files.delete(file);
	
	}catch(Exception e) {
		e.printStackTrace();
	}
			
	
	
	}
}
