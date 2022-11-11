package designpattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		Computer mycomputer=new Computer.BuildComputer().setcabinet("glass cabinet.:").setram("codex Streaker").setcpu("RogStreak..:").sethaddisk("Seagate :").build();
		System.out.println(mycomputer);
	}
 }
class Computer{
	private String cabinet;
	private String ram;
	private String cpu;
	private String harddisk;
	public Computer(BuildComputer bc) {
		this.cabinet=bc.cabinet;
		this.ram=bc.ram;
		this.cpu=bc.cpu;
		this.harddisk=bc.haddisk;
		
	}
@Override
public String toString() {
	return 
		this.cabinet+":Ram Type :"+this.ram+":Cpu Type :"+this.cpu+": Harddisk Type :"+this.harddisk;
}
static class BuildComputer{
	private String cabinet;
	private String ram;
	private String cpu;
	private String haddisk;
	
	public BuildComputer setcabinet(String cabinet) {
		this.cabinet=cabinet;
		return this;
	}
	public BuildComputer setram(String ram) {
		this.ram=ram;
		return this;
	}
	public BuildComputer setcpu(String cpu) {
		this.cpu=cpu;
		return this;
	}
	public BuildComputer sethaddisk(String harddisk) {
		this.haddisk=harddisk;
		return this;
	}
	public Computer build() {
		return new Computer(this);
	}	
}
}