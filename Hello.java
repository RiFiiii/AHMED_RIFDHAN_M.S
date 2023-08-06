package assignment;

public class Hello {
	public static void main(String[] args) {   //program entry point
		
		System.out.println("Before EXception");
		
		try {
			int i=1/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("After  Exception");
	}
}
