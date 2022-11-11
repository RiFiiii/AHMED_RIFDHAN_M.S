package jdk5to18;

public class EnumDemo {

	public static void main(String[] args) {
		Cars c;
		c=Cars.Lambo;
		
		if(c==Cars.Lambo) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not Equals...");
		}
		switch(c) {
		case Lambo:{
			System.out.println("Lambo..... "+c);
		}
		}
		Cars cc[]=Cars.values();
		for(Cars s:cc) {
			System.out.println(s);
		}
		System.out.println(Students.somu.getAge());
		for(Students s:Students.values()) {
			System.out.println(s+":"+s.getAge());
		}
		
		
	}
}

enum Cars{
	Lambo,meseratti,Maclaren,ROllysRoyce;
}

enum Students{
	ramu(30),somu(40),dummy;
	private int age;
	Students(int age){
		this.age=age;
	}
	Students(){
		this.age=0;
	}
	int getAge() {
		return this.age;
	}
}

class ProcessStudents{
	public static void main(String[] args) {
		System.out.println(Students.somu.getAge());
		for(Students s:Students.values()) {
			System.out.println(s.getAge());
		}
	}
}



