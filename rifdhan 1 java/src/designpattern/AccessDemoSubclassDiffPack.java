package designpattern;

import ch6.AccessSpecifierDemo;

public class AccessDemoSubclassDiffPack extends AccessSpecifierDemo {

	public void met() {
//		System.out.println(pri);
//		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}

class AccessDemoNonSubDiffPack{
	
	public void met() {
		AccessSpecifierDemo obj=new AccessSpecifierDemo();
//		System.out.println(obj.pri);
//		System.out.println(obj.nomod);
//		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}