package javaGoldenLaps;
import java.util.Scanner;
public class switchcaseEnum {
	enum myenum{apple,mango,grapes};
	public static void main(String[] args) {
	//Scanner Scan=new Scanner(System.in);
	
	myenum mn=myenum.grapes;
	System.out.println("/n enum switch is called.........");
	switch(mn) {
	case apple:{
		System.out.println("apple enum callled.........");
		break;
	}
	case mango:{
		System.out.println("mango enum callled.........");
		break;
	}
	case grapes:{
		System.out.println("grapes enum called....");
		break;
	}
	default:{
		System.out.println("default of enum callled....");
	}
	}

	}

}
