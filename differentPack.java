package assignment;

import advancelabook3.AccessSpecifierDemo;

public class differentPack {

}

class NonSub{
	
	public void met2() {
	AccessSpecifierDemo sp=new AccessSpecifierDemo();
	
//	System.out.println(sp.pri);   private is not available
	System.out.println(sp.pub);
//	System.out.println(sp.nomod);
//	System.out.println(sp.pro);
}
	}

class subclass extends AccessSpecifierDemo{
	public void met3() {
//	 System.out.println(pri);
		System.out.println(pub);
//		System.out.println(nomod);
		System.out.println(pro);
}}