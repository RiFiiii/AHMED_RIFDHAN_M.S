package inheritance;

public class inheritancedemo {

	public static void main(String[] args) {
		
	   //hall Hall = new meetinghall();
		//Hall=new partyHall();
	}
	class Hall{
		private void sysout() {
// TODO Auto-generated method stub
System.out.println(43);
		}
}
	class partyHall extends Hall{	
	}
	class meetinghall extends Hall{
}
}