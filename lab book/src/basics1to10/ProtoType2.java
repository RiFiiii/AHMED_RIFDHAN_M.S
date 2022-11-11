package basics1to10;

public class ProtoType2 {

	public static void main(String[] args) throws Exception {
		Human mafaz=new Human();
		Human rifdhan=mafaz.createClone();
		
		mafaz.name="Handsome star my friend";
		rifdhan.name="Dostuu of handsome star...";
		
		System.out.println(mafaz.name);
		
		System.out.println(rifdhan.name);
		
		
	}
}


class Human implements Cloneable{
	String name;
	public Human() {
		System.out.println("Human object created");
	}
	public Human createClone() throws Exception {
			return(Human)super.clone();
		
	}

}