package advancelabook3;

public class PassByReference {
	public static void main(String[] args) {
		
	
	Laddu mylad=new Laddu();
	
	PassByReference pass=new PassByReference();
	
	System.out.println("Before passimg laddu "+mylad.size);
	pass.ladduToFriend(mylad);
	System.out.println("After passimg laddu "+mylad.size);
}
	
	
	public void ladduToFriend(Laddu lad) {
		lad.size=6;
		
		pbr pb=new pbr();
		int x=10;
		
		System.out.println("Before pass by value"+x);
		pb.pbvmet(x);
		System.out.println("after pass by value"+x);
	}
}

class Laddu {
	int size=10;
	
}

class pbr{
	public void pbvmet(int i) {
		i=5;
	}
}