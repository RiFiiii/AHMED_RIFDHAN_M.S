package basics1to10;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class DynamicObjectCreation3 {

	public static void main(String[] args)throws Exception {
		Properties prop=new Properties();
		 prop.load(new FileInputStream("config.properties"));
		
		GoodBrush<Paint1> paintbrush=new GoodBrush<Paint1>();
		paintbrush=PaintContainer.getPaintBrush(paintbrush,prop);
		paintbrush.getT().Color();
		
		GoodBrush<Bathroom> restroom=new GoodBrush<Bathroom>();
		restroom=BathRoomContainer.getToiletBrush(restroom);
		restroom.getT().clean();
	}
}

class PaintContainer{
	public static GoodBrush<Paint1> getPaintBrush(GoodBrush<Paint1> paints,Properties prop) throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please tell me which color you want..");
		String paintname=scan.next();
		Object obj=Class.forName(paintname).getConstructor().newInstance();
		paints.setT((Paint1)obj);
		return paints;
	}
}

class BathRoomContainer{
	public static GoodBrush<Bathroom> getToiletBrush(GoodBrush<Bathroom> bathroom)throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell me Which part of your bathroom you want me to clean..?");
		String bathroomname=scan.next();
		Object obj=Class.forName(bathroomname).getConstructor().newInstance();
		bathroom.setT((Bathroom)obj);
		return bathroom;
	}
}


class GoodBrush<T>{
	T obj;
	public T getT() {
		return this.obj;
	}
	public void setT(T t) {
		this.obj=t;
	}
}

abstract class Bathroom{
	public abstract void  clean();
}

class Toilet extends Bathroom{
	public Toilet() {
		System.out.println("Toilet Cons is called...");
	}
	@Override
	public void clean() {
		System.out.println("Now Your Toilet is cleaned");
	}
}

class WashBasin extends Bathroom{
	public WashBasin() {
		System.out.println("WashBasin cons is created....");
	}
	@Override
	public void clean() {
		System.out.println("Now Your Sink is Cleaned...");
	}
}

abstract class Paint1{
	public abstract void Color(); 
}

class ReddPaint extends Paint1{
	public ReddPaint() {
		System.out.println("Red Piant cons Called...");
	}
	@Override
	public void Color() {
	 System.out.println("Red Color.........");	
	}
}

class BlueePaint extends Paint1{
	public BlueePaint(String s) {
		System.out.println("Blue paint cons is called"+s);
	}
	@Override
	public void Color() {
		System.out.println("Blue color.....");
	}
}