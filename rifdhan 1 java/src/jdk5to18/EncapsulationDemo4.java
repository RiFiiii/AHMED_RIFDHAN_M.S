package jdk5to18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EncapsulationDemo4 {

	public static void main(String[] args) {
		
		MyFunc1 my1=MyImplementations::new;//this will refer the first interface method
		//met to the constructor of the class
		my1.met();  //this call the logic inside the constructor.
		
		MyImplementations obj=new MyImplementations();
		
		MyFunc1 my11=MyImplementations::myEmptyMethod;//this is how u access static method.
		my11.met();
		
		MyFunc2 my22=new MyImplementations()::myParamMethod;
		my22.met("Ahmed Rifdhan",new Sample(), 20);
		
		MyFunc3 my33=new MyImplementations()::myReturnMethod;
		Sample s=my33.met(45);
		System.out.println(s);
		
		List<String> list=Arrays.asList("a","b","c","d");
		Consumer<String>c=EncapsulationDemo4::myprint;
		list.stream().forEach(c);
	}
	public static void myprint(String s) {
		System.out.println(s);
	}
}


class MyImplementations{
	public MyImplementations() {
		System.out.println("Cons Called..");
	}
	public static void myEmptyMethod() {
		System.out.println("Empty method is called...");
	}
	public void myParamMethod(String s,Sample ss,int i) {
		System.out.println( s+":"+ss+":"+i);
	}
	public Sample myReturnMethod(int i) {
		return new Sample();
	}
	
}

interface MyFunc1{
	public void met();
}
interface MyFunc2{
	public void met(String s,Sample sam,int i);
}
interface MyFunc3{
	public Sample met(int i);
}

class Sample{
	
}