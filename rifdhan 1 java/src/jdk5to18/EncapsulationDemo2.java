package jdk5to18;

public class EncapsulationDemo2 {

}

// inner class but this method also no use
interface Cola{
	public void makeCola();
}



class Pepsi1{
	public void colaBussiness(Kalimark1.CampaCola cola) {
		cola.makeCola();
	}
}

class Kalimark1{
	public void colaBussiness(CampaCola cola) {
//		Cola cola=()->{System.out.println("Make cola");};
		cola.makeCola();
	}
	class CampaCola implements Cola{
		@Override
		public void makeCola() {
			System.out.println("Campa cola make in the way of cola strategy");
			
		}
	}
}