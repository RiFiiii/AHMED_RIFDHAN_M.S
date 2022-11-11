package designpattern;

import java.util.Scanner;

public class VisitorPattern2 {
public static void main(String[] args) throws Exception{
	People rifdhan=new People();
	Scanner scan=new Scanner(System.in);
	System.out.println("Press enter to execute...");
	String itemclass=scan.next();
	
	Human human=new Human();
	Situation situation=(Situation)Class.forName(itemclass).newInstance();
	
	rifdhan.HelpHuman(human, situation);
	
}
}

class People{
	public People() {
		System.out.println("People Rifdhan is Created");
	}
	public void HelpHuman(Human human,Situation situation) {
		try {
			human.faceSituation(situation);
		}catch(HumanExceptions he) {
			he.visit();
		}
	}
}

abstract class Handlerr911{
	public abstract void faceSituation(HumanInjuredException hje);
	public abstract void faceSituation(HumanHappyException hhe);
	public abstract void faceSituation(HumanPanicException hpe);
	
}

class HandlerUss extends Handlerr911{
	@Override
	public void faceSituation(HumanInjuredException hje) {
		System.out.println("Dont worry We will save you we send ambulance");
		
	}
	@Override
	public void faceSituation(HumanHappyException hhe) {
   System.out.println("Congrats You're become Father...");
		
	}
	@Override
	public void faceSituation(HumanPanicException hpe) {
		System.out.println("Dont Panic We will find your Amount and catch The Theiver ASAP...");
		
	}
}

class Human{
	public void faceSituation(Situation situation) throws HumanExceptions{
		situation.execute();
	}
}

abstract class Situation{
	public abstract void execute() throws HumanExceptions;
}

class Accident extends Situation{
	@Override
	public void execute() throws HumanInjuredException{
		throw new HumanInjuredException("I am Injured Please Help..");
		
	}
}

class FirstBornBaby extends Situation{
	@Override
	public void execute() throws HumanHappyException{
		throw new HumanHappyException("I am very happy to become a Father...");
		
	}
}

class Theft extends Situation{
	@Override
	public void execute() throws HumanPanicException{
		throw new HumanPanicException("I lost my Money and jewellary..");
		
	}
}

abstract class HumanExceptions extends Exception{
	public abstract void visit();
} 

class HumanInjuredException extends HumanExceptions{
	String msg;
	public HumanInjuredException(String msg) {
		this.msg=msg;
	}
	public String toString(){
		return this.msg;
	}
	@Override
	public void visit() {
		new HandlerUss().faceSituation(this);
		
	}
}

class HumanHappyException extends HumanExceptions{
	String msg;
	public HumanHappyException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return this.msg;
	}
	@Override
	public void visit() {
		new HandlerUss().faceSituation(this);
		
	}
}

class HumanPanicException extends HumanExceptions{
	String msg;
	public HumanPanicException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return this.msg;
	}
	@Override
	public void visit() {
		new HandlerUss().faceSituation(this);
		
	}
}
