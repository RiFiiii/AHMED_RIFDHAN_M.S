package designpattern;

import java.util.Scanner;

/*
 *  1. Strategy Pattern
 *  2. Exception
 *  3.Custom Exception
 *  4.Polymorphism
 *  5.Visitor(how to deal with polymorphic object)
 *  6. Dynamic object creation
 *  7.dynamic binding
 *  8.we understood the drawback of multiple catch
 *  
 * NOTE : Rule is SubClasses Cannot throw an Exception whick is
 * not Declared in the throws class of super class 
 *  */
public class VisitoPatternDemo {

	public static void main(String[] args)throws  Exception{
		
		Child baby=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("Press enter to continue");
		String itemclass=scan.next();
		
		Dog1 ceaser=new Dog1();
		Item1 item=(Item1)Class.forName(itemclass).newInstance();  // use this  insteadof new keyword - for dynamic object creation
		
		baby.playWithDog(ceaser, item);
		
	}
}

class Child{
	public Child() {
		System.out.println("Child object Baby is Created.");
	}
	public void playWithDog(Dog1 dog,Item1 item) {
	try { 
		dog.play(item);
	}catch(DogExceptions de) {
		de.visit();
	}
	}
}

abstract class Handler911{
	public abstract void help(DogBiteException de);
	public abstract void help(DogBarkException dbe);
	public abstract void help(DogHappyException dhe);
}

class HandlerUs extends Handler911{
	@Override
	public void help(DogBarkException dbe) {
		System.out.println("You Have no Trouble..Just Relax");
		
	}
	@Override
	public void help(DogBiteException de) {
		System.out.println("Stay still...we will sen Ambulance..way to Hospital..");
		
	}
	@Override
	public void help(DogHappyException dhe) {
		System.out.println("I love Biscuit play Happy with dogs..");
		
	}
}

class Dog1{
	public void play(Item1 item) throws DogExceptions{
		item.execute();
	}
}

abstract class Item1 {
	public abstract void execute()throws DogExceptions;
}

class Stick1 extends Item1{
	@Override
	public void execute() throws DogBiteException{
		throw new DogBiteException("You beat i bite");
		
	}
}

class Stone1 extends Item1{
	@Override
	public void execute() throws DogBarkException{
		throw new DogBarkException("You throw i catch");
		
	}
}

class Biscuit extends Item1{
	@Override
	public void execute() throws DogExceptions {
		throw new DogHappyException("I am Happy Play with dog");
		
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
		new HandlerUs().help(this);
		
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
		new HandlerUs().help(this);
		
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
		new HandlerUs().help(this);
		
	}
}