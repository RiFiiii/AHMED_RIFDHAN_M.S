package assignment;

public class ConsDemo {

	
	public static void main(String[] args) {
		Sambar sambar=new Sambar(new Paruppu(), new Chilli());
		sambar.salt=new salt();
	}
}

class Sambar{
	salt salt;
	public Sambar(Paruppu pa,Chilli ch) {
		System.out.println("Sambar ready..");
	}
}

class Paruppu{
	public Paruppu() {
		System.out.println("paruppu ready...");
	}
}
class Chilli{
	public Chilli() {
		System.out.println("Chille ready..:");
	}
	
}
class salt{
	public salt() {
		System.out.println("salt ready");
	}
}