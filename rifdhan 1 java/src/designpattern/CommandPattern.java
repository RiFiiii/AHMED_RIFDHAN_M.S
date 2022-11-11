package designpattern;

public class CommandPattern {

	public static void main(String[] args) {
//		ChithiCitizen cc=new ChithiCitizen();
//		cc.getDeathCertificate();
		
	AmmaCitizen ac=new AmmaCitizen();
	ac.getDeathCertificate();
	}
}

//bad 

//class ChithiCitizen{
//	public void getDeathCertificate() {
//		Hospital hospital=new Hospital();
//		hospital.doPostMortem();
//		Police police=new Police();
//		police.doInvestigation();
//		Corporation corporation=new Corporation();
//		corporation.issuesDeathCertificate();
//		
//	}  
//}

class AmmaCitizen{
	static SevaCenter sc;
	static {
		sc=new SevaCenter();
		sc.setCommand(1, new Governor());
	}
	public void getDeathCertificate() {
		sc.executeCommand(1);
	}
}

class SevaCenter {
	Command c[]=new Command[5];  //Array of Command  
	public SevaCenter() {
		for(int i=0;i<5;i++) {
			c[i]= new DummyCommand();
		}
	}
	public void setCommand(int slot,Command command) {  // owner
		c[slot]=command;
	}
	public void executeCommand(int slot) {  //servant
		c[slot].execute();
	}
}

abstract class Command{  // super class or parent class
	 public abstract void execute();
}

class DummyCommand extends Command{   //sub class or child class
	@Override
	public void execute() {  
		System.out.println("i am dummy yet to be operation..");
	}
}

class Governor extends Command{
	@Override
	public void execute() {
		Hospital hospital=new Hospital();     
		hospital.doPostMortem();
		Police police=new Police();
		police.doInvestigation();
		Corporation corporation=new Corporation();
		corporation.issueDeathCertificate();
	}
}
class Hospital{
	public void doPostMortem() {
		System.out.println("PostMortem Done....");
	}
	}

class Police{
	public void doInvestigation(){
		System.out.println("Investigation Done..");
	}
}

class Corporation{
	public void issueDeathCertificate() {
		System.out.println("death certificate Issued...");
	}
	public void ClearanceCertificate() {
		System.out.println("Clearance Certificate...");
	}
}

