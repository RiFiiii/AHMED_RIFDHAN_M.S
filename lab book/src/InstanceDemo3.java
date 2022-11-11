
public class InstanceDemo3 {
		
	public static void main(String[] args) {
		TrainingRoom tr141=new TrainingRoom();
		TrainingRoom tr142=new TrainingRoom();
		TrainingRoom tr143=new TrainingRoom();
		
		System.out.println(tr141.sulab); //for all instance same object will be used class variable
		System.out.println(tr141.computertable);
		System.out.println(tr141.water);
		
		System.out.println(tr142.sulab); //for all instance same object will be used class variable
		System.out.println(tr142.computertable);
		System.out.println(tr142.water);
		
		System.out.println(tr143.sulab); //for all instance same object will be used class variable
		System.out.println(tr143.computertable);
		System.out.println(tr143.water);
	}
}

class TrainingRoom{
	static toilet sulab=new toilet();
	table computertable=new table();  //instance variable
	static waterPurifier water=new waterPurifier();
}
class toilet{
	
}
class table{}

class waterPurifier{}

