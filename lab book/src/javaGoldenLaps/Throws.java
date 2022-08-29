package javaGoldenLaps;
import java.io.*;
public class Throws {

	 static void  throwOne() throws FileNotFoundException {
		 System.out.println("Inside ThrowOne.");
		 throw new FileNotFoundException();
	 }
	 public static void main(String[] args) throws FileNotFoundException {
		throwOne();
	}
		 

	}

