package jdk5to18;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path path=FileSystems.getDefault().getPath("dir", "scr.zip");
		System.out.println(path);
		
		
		//or
		
		Path filepath=Paths.get("dir/src.zip");
		System.out.println(filepath);
	
		Path currentDirectory=Paths.get("").toAbsolutePath();
		System.out.println(currentDirectory);
	
		// To join two paths...
		
		Path path1=Paths.get("C:\\Users\\marhy\\eclipse-workspace\\assignment");
		System.out.println(path1.resolve("Test.java"));
		
		
	}
}
