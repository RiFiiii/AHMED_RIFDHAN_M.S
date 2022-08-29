import java.util.Collections;

import static java.util.Collections.*;

import java.lang.reflect.Field;
public class annoDemo009 {

	public static void main(String[] args) throws Exception{
		 WatchMan ramesh=new agency().getWatchMan();
		 System.out.println(ramesh.cap);
		 System.out.println("color of the cap :" +ramesh.cap.color);

		emptyList();
		emptyEnumeration();
		emptyListIterator();
	}

}
class agency{
	public WatchMan getWatchMan() throws Exception{
		WatchMan ramesh=new WatchMan();
	    
		Class c=ramesh.getClass();
	    
	    Field f=c.getDeclaredField("cap"); 
	    
	    f.setAccessible(true);
	    
	   inject1 inj1= f.getAnnotation(inject1.class);
	    if(inj1 != null) {
	    	 
			String v=inj1.value();
	    	cap cap=new cap();
	    	cap.color=v;
	    	ramesh.cap=cap;
	    	 
	    }
		return ramesh;
	}
}
class WatchMan{ //A watchman should compulsory come with cap before use annotation o/p will be null
	@inject1//(value = "skyblue  cap")  if i remove default value in annotation Here i have to give Value
	cap cap;
	torch torch;
	stick stick;
}

class cap{
	String color;
}
class torch{}
class stick{}