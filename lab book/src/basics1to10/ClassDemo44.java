package basics1to10;

public class ClassDemo44 {

	public static void main(String[] args) {
	
		Demo2 obj=new Demo2();
		obj.met(100, 200, "Rifdhan", 300);
		
		obj.met2(23,"aaaa","fdsaa",new String("fdafdasa"),122,3435,564,89);
		
		obj.met3(new Object[] {23,"aaaa","fdas",new String("fdafdasa"),122,3435,564 });
}
}

class Demo2{
	void met(int i,int j,String s,int k) {
		
	}
	void met2(Object ...obj) {
		System.out.println(obj.length);
		System.out.println(obj[2]);
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}
	void met3(Object obj[]) {
		
	}
}
