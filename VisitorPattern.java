package advancelabook3;

import java.util.Scanner;



public class VisitorPattern {

	public static void main(String[] args) {
		Child by=new Child();
		
	}
}

abstract class Item{
	public abstract void execute()throws DogExceptions;
}

class Stone extends Item{
	@Override
	public void execute() throws DogBarkException{
		throw new DogBarkException("You Have No Problem"); 
	}
}

class Stick extends Item{
	@Override
	public void execute() throws DogBiteException {
		throw new DogBiteException("You Beat I Bite");
	}
}
class Dog{
	
	public void play(Item item)throws DogExceptions{
		item.execute();
	}
	
}

abstract class DogExceptions extends Exception{
	public abstract void visit();
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	@Override
	public void visit() {
		new Handler911us().handle(this);
	}
}
class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	@Override
	public void visit() {
		new Handler911us().handle(this);
		
	}
}

class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	@Override
	public void visit() {
		new Handler911us().handle(this);
		
	}
}

class Child{
	public Child() {
		System.out.println("Child obj Created..");
	}
	public void playWithDog(Dog dog,Item item) {
		try {
			dog.play(item);;
		}catch(DogExceptions de){
			de.printStackTrace();
			de.visit();
		}
	}
}

abstract class Handler911{
	public abstract void handle(DogBiteException dbe);
	public abstract void handle(DogBarkException dbr);
	public abstract void handle(DogHappyException dhr) ;
}

class Handler911us extends Handler911{
	@Override
	public void handle(DogBarkException dbr) {
		System.out.println("Will Have No Problem..");
	}
	@Override
	public void handle(DogBiteException dbe) {
		System.out.println("You Beat I Bite");
	}@Override
	public void handle(DogHappyException dhr) {
		System.out.println("");
	}
}

