package jdk5to18;


//if tou go for 
public class EncapsulationDemo3 {

	public static void main(String[] args) {
		
		Pepsi2 pepsi=new Pepsi2();
		pepsi.colaBussiness();
		
		Kalimark2 kali=new Kalimark2();
			kali.colaBussiness();
			kali.makeCocoCola();
	}
}


interface Cola1{
	public void makeCola();
	
}

class Pepsi2{
	public void colaBussiness() {
		
		// Anonymous
		new Cola() {
			
			@Override
			public void makeCola() {
				System.out.println("Pepsi agreement with kalimark and buy cola Methodology...");
			}
		}.makeCola();;
	}
}

class Kalimark2{
	public void colaBussiness() {
		
		//Lambda Methodology..
		
		Cola cola=()->{System.out.println("make cola");};
		cola.makeCola();
		System.out.println("Kalimark ");
	}
	public void makeCocoCola() {
		System.out.println("cola made by campa cola...");
	}
}