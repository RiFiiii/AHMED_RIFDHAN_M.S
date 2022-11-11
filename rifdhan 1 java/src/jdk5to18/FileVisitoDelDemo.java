package jdk5to18;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitoDelDemo {

	public static void main(String[] args) {
		
		Path dirToDelete=Paths.get("dir");
		FileVisitor<Path> visitor=getFileVisitor();
		
		try {
			Files.walkFileTree(dirToDelete, visitor);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static FileVisitor<Path>getFileVisitor(){
		
		class DeleteDirVisitor extends SimpleFileVisitor<Path>{
			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
				FileVisitResult result= FileVisitResult.CONTINUE;
				if(e !=null) {
					System.out.format("Error deleting %s. %s%n", dir, e.getMessage());
					return  FileVisitResult.TERMINATE;
				}else {
					Files.delete(dir);
					System.out.format("Deleted directory %s%n",dir);
				}
				return result;
			}
			@Override
			public FileVisitResult visitFile(Path file,BasicFileAttributes attrs) throws IOException{
				Files.delete(file);
				System.out.format("Deleted file %s%n",file);
				return FileVisitResult.CONTINUE;
			}
		}
		FileVisitor<Path> visitor=new DeleteDirVisitor();
		return visitor;
	}
}
