package jdk5to18;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorDemo {

	public static void main(String[] args) {
		Path startdir=Paths.get("");
		FileVisitor<Path> visitor= getFileVisitor();
		try {
			Files.walkFileTree(startdir, visitor);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


public static FileVisitor<Path> getFileVisitor(){
	class DirVisitor<Path> extends SimpleFileVisitor<Path>{
		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
			
			System.out.format("%s [Directory]%n", dir);
			return FileVisitResult.CONTINUE;
		}
		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			System.out.format("%s [File, Size: %s bytes]",file,attrs.size());
			return FileVisitResult.CONTINUE;
		
		}
	}
	FileVisitor<Path> visitor=new DirVisitor<>();
	return visitor;
}}