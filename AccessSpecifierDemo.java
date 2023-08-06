package advancelabook3;

public class AccessSpecifierDemo {

	private int pri;
	public int pub;
	int nomod;
	protected int pro;
	
	public void met() {
		System.out.println(pri);
		System.out.println(pub);
		System.out.println(nomod);
		System.out.println(pro);
	}
}


class NonSub{
	
	public void met2() {
	AccessSpecifierDemo sp=new AccessSpecifierDemo();
	
//	System.out.println(sp.pri);   private is not available
	System.out.println(sp.pub);
	System.out.println(sp.nomod);
	System.out.println(sp.pro);
}
	}

class SamePackSub extends AccessSpecifierDemo{
	public void met3() {
//	System.out.println(pri);
	System.out.println(pub);
	System.out.println(nomod);
	System.out.println(pro);
}}