package basics1to10;


			//universal Remote Concepts
public class CommandPattern {
public static void main(String[] args) {
	

	UniversalRemote remote=new UniversalRemote();
	remote.getUniversalRemote();
}
}

class UniversalRemote{
	static RemoteCenter rc;
	static {
		rc=new RemoteCenter();
		rc.setCommand(1, new RemoteTechnician());
	}
	public void getUniversalRemote(){
		rc.executeCommand(1);
	}
}

class RemoteCenter{
	Command c[]=new Command[6];  //array of command
	public RemoteCenter() {  //constructor
		for(int i=0;i<6;i++) {
			c[i]=new DummyCommand();
		}
	}
	public void setCommand(int slot,Command command) {
		c[slot]=command;
	}
	public void executeCommand(int slot) {
		c[slot].execute();
	}
}

abstract class Command{
	public abstract void execute() ;
}

class DummyCommand extends Command{
	@Override
	public void execute() {
		System.out.println("i am Dummy yet to be execute");
	}
}

class RemoteTechnician extends Command{

	@Override
	public void execute() {
		NewsChannelButton nc=new NewsChannelButton();
		nc.turnOnTv();
		AcButton ac=new AcButton();
		ac.turnOnAc();
		XBoxButton xb=new XBoxButton();
		xb.turnOnXbox();
		DolbySpeakerButton ds=new DolbySpeakerButton();
		ds.increaseSound();
	}
}


class NewsChannelButton{
	public void turnOnTv(){
		System.out.println("turn on tv Go to News Channel");
	}
}

class AcButton{
	public void turnOnAc() {
		System.out.println("turn on Ac ");
	}
}

class XBoxButton{
	public void turnOnXbox() {
		System.out.println("play Table Tennis // play doubles");
	}
}

class DolbySpeakerButton{
	public void increaseSound() {
		System.out.println("Sound Increased");
	}
}