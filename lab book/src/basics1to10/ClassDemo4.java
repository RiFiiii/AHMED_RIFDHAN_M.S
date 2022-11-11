package basics1to10;

public class ClassDemo4 {
public static void main(String[] args) {
	
	Demo obj=new Demo();
	obj.met(20, 30, "Welcome");
	
	int[] a=new int[] {10,20,30,40};
	obj.met2(a); //indirect
	
	obj.met2(new int[] {10,3,40,380});  // direct
	
	obj.met3(120,320,30,20,102,32); // we are passing arguments
	
	int b[]=obj.met3(20,30,203,200);
	
	for(int i:b) {
		System.out.println(" Print value of i"+i);
	}
	obj.met4("aaa",3234,"affds",new Demo());
}
}

class Demo{
	void met(int i,int j,String s) {
		System.out.println(i+":"+j+":"+s);
	}
	
	void met2(int a[]) { //method is accepting parameters
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.println(i);
		}
	}
	int[] met3(int...abc) { //Variables arguments (VARARGS)
		for(int i:abc) {
			System.out.println(i);
		}
	return abc;
	} 
	void met4(Object ...o) {
		
	}
}