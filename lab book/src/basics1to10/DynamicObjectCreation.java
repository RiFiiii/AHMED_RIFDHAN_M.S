package basics1to10;

import java.util.Scanner;

public class DynamicObjectCreation {

	public static void main(String[] args)throws Exception {
		
		Sample sample=new Sample(); // static object creation
		
		// adv - fast object creation is acheived using new keyword
		//diasdv - this is static, you cannot change the class name at runtime
		
		//dynamic object creation
		//deprecated - this way will be removed future
		
		//API=apllication programming interface
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a class name either sample 1 or sample2");
		
		String classname=scan.next();
		//this below call is before jdk5
	//	ParentSample s=(ParentSample)Class.forName(classname).newInstance();  //dynamic
		//this below call is above jdk5
		
		ParentSample s=(ParentSample)Class.forName(classname).getConstructor(null).newInstance(args);
				
		System.out.println(s);
		s.met();
	}
}

abstract class ParentSample{
	public abstract void met();
}

class Sample extends ParentSample{
	public void met() {
		System.out.println("met method of sample called..");
	}
	
}
class Sample2 extends ParentSample{
	public void met() {
		System.out.println("Met2 method of sample called..");
	}
}